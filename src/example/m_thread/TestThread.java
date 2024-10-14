package example.m_thread;

import java.util.concurrent.ThreadLocalRandom;

public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("Start  getName()                        = " + getName());
        int i = ThreadLocalRandom.current().nextInt(100, 1_000);
        System.out.println("Sleep: " + i + "                              = " + getName());
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finish getName()                        = " + getName());
    }
}
