package example.T18_Thread_Kassa.v4_Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

public class User implements Runnable {
    private final Semaphore kasses;

    public User(Semaphore kasses) {
        this.kasses = kasses;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " ? Ожидает свободную кассу");
            kasses.acquire();
            System.out.println(Thread.currentThread().getName() + " + Пришел на кассу");

            System.out.println(Thread.currentThread().getName() + " $ Обслуживается на кассе - Начало");
            int i = ThreadLocalRandom.current().nextInt(100, 1_000);
            Thread.sleep(i);
            System.out.println(Thread.currentThread().getName() + " $ Обслуживается на кассе - Конец");

            kasses.release();
            System.out.println(Thread.currentThread().getName() + " - Освобождает кассу");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
