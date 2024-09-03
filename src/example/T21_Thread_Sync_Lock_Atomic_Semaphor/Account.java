package example.T21_Thread_Sync_Lock_Atomic_Semaphor;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    int          primInt = 0;
    int          primIntSync = 0;
    int          primIntLock = 0;
    int          primIntSem = 0;
    final AtomicInteger atomInt = new AtomicInteger(0);
    final Lock lock = new ReentrantLock();
    final Semaphore semaphore = new Semaphore(1);

    public void info(){
        System.out.printf("%-19s %-9s %n", "atomInt:", this.atomInt);
        System.out.printf("%-19s %-9d %n", "primInt:", this.primInt);
        System.out.printf("%-19s %-9d %n", "primIntSync:", this.primIntSync);
        System.out.printf("%-19s %-9s %n", "primIntSem:", this.primIntSem);
        System.out.printf("%-19s %-9d %n", "primIntLock:", this.primIntLock);
    }
}
