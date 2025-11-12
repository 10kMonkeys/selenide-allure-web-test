# -------------------------
# Stage 1: builder (cache deps, compile)
# -------------------------
FROM maven:3.9.9-eclipse-temurin-21-jammy AS builder

WORKDIR /build

# копируем pom.xml и wrapper (если есть)
COPY pom.xml mvnw* ./
# .mvn может не существовать, поэтому используем условие
RUN mkdir -p .mvn

# заведомо кэшируем зависимости
RUN mvn -B -Dmaven.repo.local=/root/.m2 dependency:go-offline

# копируем исходники
COPY src ./src
RUN mvn -B -Dmaven.repo.local=/root/.m2 -DskipTests package

# -------------------------
# Stage 2: test runner image
# -------------------------
FROM maven:3.9.9-eclipse-temurin-21-jammy AS testrunner

WORKDIR /app

# кэш зависимостей
COPY --from=builder /root/.m2 /root/.m2
COPY --from=builder /build /app

#VOLUME ["/app/target", "/app/allure-results"]
ENV MAVEN_OPTS="-Xmx2g -XX:+UseG1GC"
