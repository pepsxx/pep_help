package example.T21_Thread_Sync_Lock_Atomic_Semaphor;

import java.util.concurrent.ThreadLocalRandom;

public class TestThread implements Runnable {

    Account acc;

    public TestThread(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        System.out.printf("%-9S %-9S ----------%n", "Start", Thread.currentThread().getName());
        for (int i = 0; i < 5_000; i++) {

            this.sleep();
            if (Thread.currentThread().getName().endsWith("10") && i % 100 == 0) {
                System.out.printf("%-9d %-9S ----------%n", i, Thread.currentThread().getName());
                acc.info();
            }

            //atomInt
            acc.atomInt.incrementAndGet();

            //primInt
            acc.primInt++;

            //primIntSync
            synchronized (acc) {
                acc.primIntSync++;
            }

            //primIntSem
            try {
                acc.semaphore.acquire();
                acc.primIntSem++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                acc.semaphore.release();
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
        }
        System.out.printf("%-9S %-9S ----------%n", "Stop", Thread.currentThread().getName());
    }

    public void sleep() {
        int t = ThreadLocalRandom.current().nextInt(0, 10);
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
