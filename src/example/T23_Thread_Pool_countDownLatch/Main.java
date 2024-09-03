package example.T23_Thread_Pool_countDownLatch;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        List<String> detail = List.of("Двигатель", "Обтекатель", "Бак", "Ступень №1", "Ступень №1", "Кабина", "Спасательный модуль");
        CountDownLatch countDownLatch = new CountDownLatch(detail.size());

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(new Rocket(countDownLatch));
        detail.stream()
                .map(d -> new RocketDetail(countDownLatch, d))
                .forEach(executorService::submit);
        try {
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
