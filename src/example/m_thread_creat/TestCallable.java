package example.m_thread_creat;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class TestCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Start  Thread.currentThread().getName() = " + Thread.currentThread().getName());
        int i = ThreadLocalRandom.current().nextInt(100, 1_000);
        System.out.println("Sleep: " + i + "                              = " + Thread.currentThread().getName());
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finish Thread.currentThread().getName() = " + Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }
}
