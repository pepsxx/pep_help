package Example.T17_Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
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
        // Создание через лямбда выражение (Анонимный класс через функциональный интерфейс Runnable)
        Thread l1 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));
        Thread l2 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));
        Thread l3 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));

        t1.start();
        t2.start();
        t3.start();
        r1.start();
        r2.start();
        r3.start();
        l1.start();
        l2.start();
        l3.start();

        t1.join();
        t2.join();
        t3.join();
        r1.join();
        r2.join();
        r3.join();
        l1.join();
        l2.join();
        l3.join();
        System.out.println("-----------------------------------------------------------------------------------------");

        int maxThread = 3;
        maxThread *= 2;
        Thread[] masThreads = new Thread[maxThread];
        for (int i = 0; i < maxThread; i++) {
            masThreads[i] = new TestThread();
            masThreads[i].start();
            masThreads[++i] = new Thread(new TestRunnable());
            masThreads[i].start();
        }
        for (int i = 0; i < maxThread; i++) {
            masThreads[i].join();
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Finish Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
