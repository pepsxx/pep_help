package example.m_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Start  Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("-----------------------------------------------------------------------------------------");
        // Создание через наследование от класса Thread.
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();
        // Создание через имплементацию от интерфейса Runnable
        Thread r1 = new Thread(new TestRunnable());
        Thread r2 = new Thread(new TestRunnable());
        Thread r3 = new Thread(new TestRunnable());
        // Создание через имплементацию от интерфейса Callable
        FutureTask<String> future1 = new FutureTask<>(new TestCallable());
        FutureTask<String> future2 = new FutureTask<>(new TestCallable());
        FutureTask<String> future3 = new FutureTask<>(new TestCallable());
        Thread c1 = new Thread(future1);
        Thread c2 = new Thread(future2);
        Thread c3 = new Thread(future3);
        // Создание через лямбда выражение (Анонимный класс через функциональный интерфейс Runnable или Callable)
        Thread l1 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));
        Thread l2 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));
//        Thread l3 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));
        Thread l3 = new Thread(new FutureTask<>(() -> {return "Test";}));

        t1.start();
        t2.start();
        t3.start();
        r1.start();
        r2.start();
        r3.start();
        c1.start();
        c2.start();
        c3.start();
        l1.start();
        l2.start();
        l3.start();

        t1.join();
        t2.join();
        t3.join();
        r1.join();
        r2.join();
        r3.join();
        c1.join();
        c2.join();
        c3.join();
        l1.join();
        l2.join();
        l3.join();

        System.out.println("future1.get() = " + future1.get());
        System.out.println("future2.get() = " + future2.get());
        System.out.println("future3.get() = " + future3.get());
        System.out.println("-----------------------------------------------------------------------------------------");

        int maxThread = 3;
        maxThread *= 3;
        Thread[] masThreads = new Thread[maxThread];
        for (int i = 0; i < maxThread; i++) {
            masThreads[i] = new TestThread();
            masThreads[i].start();
            masThreads[++i] = new Thread(new TestRunnable());
            masThreads[i].start();
            masThreads[++i] = new Thread(new FutureTask<>(new TestCallable()));
            masThreads[i].start();
        }
        for (int i = 0; i < maxThread; i++) {
            masThreads[i].join();
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Finish Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
