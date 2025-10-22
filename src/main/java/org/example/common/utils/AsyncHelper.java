package org.example.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.awaitility.Awaitility;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

@Slf4j
public class AsyncHelper {

    private static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(15);
    private static final Duration DEFAULT_POLL_INTERVAL = Duration.ofMillis(500);

    /**
     * Универсальный метод для асинхронного действия с Awaitility и логированием
     *
     * @param action        Действие, возвращающее результат типа T
     * @param timeout       Максимальное время ожидания
     * @param pollInterval  Интервал опроса
     * @param <T>           Тип результата
     * @return CompletableFuture с результатом после успешного Awaitility
     */
    public static <T> CompletableFuture<T> runAsyncWithAwaitility(
            Supplier<T> action,
            Duration timeout,
            Duration pollInterval
    ) {
        return CompletableFuture.supplyAsync(() -> {
            AtomicReference<T> result = new AtomicReference<>();

            try {
                Awaitility.await()
                        .atMost(timeout)
                        .pollInterval(pollInterval)
                        .untilAsserted(() -> {
                            T temp = action.get();
                            result.set(temp);
                        });
            } catch (Exception e) {
                log.error("Async operation failed or timed out", e);
                throw new RuntimeException("Awaitility timeout or error", e);
            }

            return result.get();
        });
    }

    /**
     * Перегрузка с дефолтными таймаутом и интервалом
     */
    public static <T> CompletableFuture<T> runAsyncWithAwaitility(Supplier<T> action) {
        return runAsyncWithAwaitility(action, DEFAULT_TIMEOUT, DEFAULT_POLL_INTERVAL);
    }
}
