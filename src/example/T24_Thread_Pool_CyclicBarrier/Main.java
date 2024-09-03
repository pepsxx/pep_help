package example.T24_Thread_Pool_CyclicBarrier;

import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        List<String> detail = List.of("Двигатель", "Обтекатель", "Бак", "Ступень №1", "Ступень №1", "Кабина", "Спасательный модуль");
        System.out.println("Ракета готовиться к пуску");
        System.out.println("------------------------------");

        CyclicBarrier cyclicBarrier = new CyclicBarrier(detail.size());

        ExecutorService executorService = Executors.newCachedThreadPool();
        detail.stream()
                .map(d -> new RocketDetail(cyclicBarrier, d))
                .forEach(executorService::submit);
        try {
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("------------------------------");
        System.out.println("Ракета Полетела");

    }
}
