# Базовый образ: Maven + Java 21 + Ubuntu (jammy = 22.04)
FROM maven:3.9.9-eclipse-temurin-21-jammy

# Установка зависимостей для UI тестов
RUN apt-get update && apt-get install -y \
    wget  \
    curl  \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Копируем проект внутрь контейнера
WORKDIR /app
COPY . .

#RUN mkdir allure-results

# Скачиваем зависимости
RUN mvn dependency:go-offline -B
