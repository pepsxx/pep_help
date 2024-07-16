package Example.T21_Thread_Sync_Lock_Atomic_Semaphor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%-9S %-9S ----------%n", "Start", Thread.currentThread().getName());
        List<Thread> threadList = new ArrayList<>();
        Account acc1 = new Account();
        int n = 100;
        for (int i = 0; i < n; i++) threadList.add(new Thread(new TestThread(acc1), "th" + i));
        for (int i = 0; i < n; i++) threadList.get(i).start();
        for (int i = 0; i < n; i++) threadList.get(i).join();

        acc1.info();

        System.out.printf("%-9S %-9S ----------%n", "Stop", Thread.currentThread().getName());
    }
}
