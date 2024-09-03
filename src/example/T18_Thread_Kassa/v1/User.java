package example.T18_Thread_Kassa.v1;

import java.util.Queue;

public class User implements Runnable {
    private final Queue<Kass> kasses;

    public User(Queue<Kass> kasses) {
        this.kasses = kasses;
    }

    @Override
    public void run() {
        try {
            synchronized (kasses) {
                while (true) {
                    if (!kasses.isEmpty()) {
                        System.out.println(Thread.currentThread().getName() + " + Обслуживается");
                        Kass kass = kasses.remove();
                        kasses.wait(100);
                        kasses.add(kass);
                        System.out.println(Thread.currentThread().getName() + " - Освобождает");
                        kasses.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ? Ожидает");
                        kasses.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
