package example.T24_Thread_Pool_CyclicBarrier;

import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        // Создаём список запчастей
        List<String> detail = List.of("Двигатель", "Обтекатель", "Бак", "Ступень №1", "Ступень №1", "Кабина", "Спасательный модуль");

        System.out.println("Ракета готовиться к пуску");
        System.out.println("------------------------------");

        // Подготавливаем барьер = количество деталей
        CyclicBarrier cyclicBarrier = new CyclicBarrier(detail.size());

        // Подготавливаем пул потоков newCachedThreadPool
        // Потоков по количеству заданий так как потоков должно быть не меньше чем заданий
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Добавляем потоки по созданию деталей
        // По достижении барьера поток начинает ожидать, количество увеличивается
        // Барьер снимется при достижении нужного количества потоки продолжают выполнение
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
