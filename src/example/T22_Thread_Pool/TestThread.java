package example.T22_Thread_Pool;

import java.util.concurrent.ThreadLocalRandom;

public class TestThread implements Runnable {
    Account acc;

    public TestThread(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        System.out.printf("%-9S %-9S ----------%n", "Start", Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            this.sleep();

            //primInt
            acc.primInt++;

            //primIntSync
            synchronized (acc) {
                acc.primIntSync++;
            }

            //primIntLock
            while (true) {
                if (acc.lock.tryLock()) {
                    try {
                        acc.primIntLock++;
                    } finally {
                        acc.lock.unlock();
                        break;
                    }
                } else {
                    this.sleep();
                }
            }

            //atomInt
            acc.atomInt.incrementAndGet();

//            if (Thread.currentThread().getName().equals("pool-1-thread-10") && i % 10 == 0) {
            if (Thread.currentThread().getName().endsWith("10") && i % 10 == 0) {
                System.out.printf("%-9d %-9S ----------%n", i, Thread.currentThread().getName());
                acc.info();
            }
        }
        System.out.printf("%-9S %-9S ----------%n", "Stop", Thread.currentThread().getName());
    }

    public void sleep() {
        int t = ThreadLocalRandom.current().nextInt(0, 100);
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
