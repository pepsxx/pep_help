package Example.T17_Thread;

import java.util.concurrent.ThreadLocalRandom;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Start  Thread.currentThread().getName() = " + Thread.currentThread().getName());
        int i = ThreadLocalRandom.current().nextInt(100, 1_000);
        System.out.println("Sleep: " + i);
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finish Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
