package Example.T18_Thread_Kassa.v2;

import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class User implements Runnable {
    private final Queue<Kass> kasses;

    public User(Queue<Kass> kasses) {
        this.kasses = kasses;
    }

    @Override
    public void run() {
        try {
            Kass kass = null;

            synchronized (kasses) {
                while (true) {
                    if (!kasses.isEmpty()) {
                        System.out.println(Thread.currentThread().getName() + " + Пришел на кассу");
                        kass = kasses.remove();
                        kasses.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ? Ожидает свободную кассу");
                        kasses.wait();
                    }
                }
            }

            System.out.println(Thread.currentThread().getName() + " $ Обслуживается на кассе - Начало");
            int i = ThreadLocalRandom.current().nextInt(100, 1_000);
            Thread.sleep(i);
            System.out.println(Thread.currentThread().getName() + " $ Обслуживается на кассе - Конец");
            synchronized (kasses) {
                kasses.add(kass);
                System.out.println(Thread.currentThread().getName() + " - Освобождает кассу");
                kasses.notifyAll();
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
