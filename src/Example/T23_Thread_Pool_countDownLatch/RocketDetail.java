package Example.T23_Thread_Pool_countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

public class RocketDetail implements Runnable {
    private final CountDownLatch countDownLatch;
    private final String string;


    public RocketDetail(CountDownLatch countDownLatch, String string) {
        this.countDownLatch = countDownLatch;
        this.string = string;
    }

    @Override
    public void run() {
        System.out.printf("%-19s %-14s%n", "Деталь готовиться:", string);
        try {
            int time = ThreadLocalRandom.current().nextInt(0,1_000);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
        System.out.printf("%-19s %-14s%n", "Деталь готова:", string);
    }
}
