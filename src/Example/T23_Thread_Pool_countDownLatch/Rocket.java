package Example.T23_Thread_Pool_countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {
    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    final private CountDownLatch countDownLatch;

    @Override
    public void run() {
        System.out.println("Ракета готовиться к пуску");
        System.out.println("------------------------------");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------");
        System.out.println("Ракета Полетела");


    }
}
