package example.T24_Thread_Pool_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

public class RocketDetail implements Runnable {
    private final CyclicBarrier cyclicBarrier;
    private final String string;


    public RocketDetail(CyclicBarrier cyclicBarrier, String string) {
        this.cyclicBarrier = cyclicBarrier;
        this.string = string;
    }

    @Override
    public void run() {
        System.out.printf("%-19s %-14s%n", "Деталь готовиться:", string);
        try {
            int time = ThreadLocalRandom.current().nextInt(0,1_000);
            Thread.sleep(time);
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%-19s %-14s%n", "Деталь готова:", string);
    }
}
