package Example.T17_Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start  Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("-----------------------------------------------------------------------------------------");
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();

        Thread r1 = new Thread(new TestRunnable());
        Thread r2 = new Thread(new TestRunnable());
        Thread r3 = new Thread(new TestRunnable());

        Thread l1 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));
        Thread l2 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));
        Thread l3 = new Thread(() -> System.out.println("StaFin Thread.currentThread().getName() = " + Thread.currentThread().getName()));

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::t1.getState() = " + t1.getState());

        t1.start();
        t2.start();
        t3.start();
        r1.start();
        r2.start();
        r3.start();
        l1.start();
        l2.start();
        l3.start();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::t1.getState() = " + t1.getState());

        t1.join();
        t2.join();
        t3.join();
        r1.join();
        r2.join();
        r3.join();
        l1.join();
        l2.join();
        l3.join();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::t1.getState() = " + t1.getState());
        System.out.println("-----------------------------------------------------------------------------------------");

        int maxThread = 3;
        maxThread *= 2;
        Thread[] masThread = new Thread[maxThread];
        for (int i = 0; i < maxThread; i++) {
            masThread[i] = new TestThread();
            masThread[i].start();
            masThread[++i] = new Thread(new TestRunnable());
            masThread[i].start();
        }
        for (int i = 0; i < maxThread; i++) {
            masThread[i].join();
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Finish Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
