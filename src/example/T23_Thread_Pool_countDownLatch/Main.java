package example.T23_Thread_Pool_countDownLatch;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // Создаём список запчастей
        List<String> detail = List.of("Двигатель", "Обтекатель", "Бак", "Ступень №1", "Ступень №1", "Кабина", "Спасательный модуль");

        // Подготавливаем защелку = количество деталей
        CountDownLatch countDownLatch = new CountDownLatch(detail.size());

        // Подготавливаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Добавляем поток по созданию ракеты
        // Он будет ждать срабатывания защелки
        executorService.submit(new Rocket(countDownLatch));

        // Добавление потоков по созданию деталей
        // По окончании потока уменьшает счетчик защелки на один
        detail.stream()
                .map(d -> new RocketDetail(countDownLatch, d))
                .forEach(executorService::submit);

        // Запуск потоков
        // Защелка сработает когда счетчик будет 0
        try {
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
