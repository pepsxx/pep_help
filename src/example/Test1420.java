package example;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;






    public class Test1420 {
        public static void main(String[] args) throws InterruptedException {
            // Создаем объект Counter
            Counter counter = new Counter();

            // Создаем очередь для отслеживания ссылок
            ReferenceQueue<Counter> referenceQueue = new ReferenceQueue<>();

            // Создаем фантомную ссылку на объект Counter
            PhantomReference<Counter> phantomRef = new PhantomReference<>(counter, referenceQueue);

            System.out.println("Создана фантомная ссылка на объект Counter");

            // Удаляем оригинальный объект, чтобы проверить работу фантомной ссылки
            counter = null;
            System.gc();

            // Проверяем, была ли добавлена фантомная ссылка в очередь
            while (referenceQueue.poll() != null) {
                Object ref = referenceQueue.remove();
                if (ref instanceof PhantomReference<?>) {
                    System.out.println("Фантомная ссылка удалена из памяти");
                }
            }
        }
    }

    class Counter {}



