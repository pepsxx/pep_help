package example.T22_Thread_Pool;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    int primInt = 0;
    int primIntSync = 0;
    int primIntLock = 0;
    final AtomicInteger atomInt = new AtomicInteger(0);
    final Lock lock = new ReentrantLock();

    public void info() {
        System.out.printf("%-19s %-9d %n", "primInt:", this.primInt);
        System.out.printf("%-19s %-9d %n", "primIntSync:", this.primIntSync);
        System.out.printf("%-19s %-9d %n", "primIntLock:", this.primIntLock);
        System.out.printf("%-19s %-9s %n", "atomInt:", this.atomInt);
    }
}
