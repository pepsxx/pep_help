package example.T18_Thread_Kassa.v3_BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class User implements Runnable {
    private final BlockingQueue<Kass> kasses;

    public User(BlockingQueue<Kass> kasses) {
        this.kasses = kasses;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " ? Ожидает свободную кассу");
            Kass kass = kasses.take();
            System.out.println(Thread.currentThread().getName() + " + Пришел на кассу");

            System.out.println(Thread.currentThread().getName() + " $ Обслуживается на кассе - Начало");
            int i = ThreadLocalRandom.current().nextInt(100, 1_000);
            Thread.sleep(i);
            System.out.println(Thread.currentThread().getName() + " $ Обслуживается на кассе - Конец");

            kasses.add(kass);
            System.out.println(Thread.currentThread().getName() + " - Освобождает кассу");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
