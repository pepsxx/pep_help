package example.T22_Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%-9S %-9S ----------%n", "Start", Thread.currentThread().getName());

        Account acc1 = new Account();

//        ExecutorService threadPool = Executors.newSingleThreadExecutor(); // Потоков 1
//        ExecutorService threadPool = Executors.newFixedThreadPool(25);    // Потоков 25
//        ExecutorService threadPool = Executors.newCachedThreadPool();     // Потоков по количеству заданий
        ExecutorService threadPool = Executors.newWorkStealingPool();       // Потоков по мощности железа;
        for (int i = 0; i < 10; i++) threadPool.submit(new TestThread(acc1));
        threadPool.shutdown();
        threadPool.awaitTermination(10, TimeUnit.MINUTES);

        acc1.info();

        System.out.printf("%-9S %-9S ----------%n", "Stop", Thread.currentThread().getName());
    }
}
