package example.T25_Thread_sync;

import lombok.SneakyThrows;

import java.util.concurrent.*;

public class Main {
    static private final String FORMAT = "%-30s %-10s %-40s %-10s%n";
    static private final int MIN_MIL_SEC_PAUSE = 100;
    static private final int MAX_MIL_SEC_PAUSE = 1_000;
    static private final int NUMBER_LOOP = 100;
    static private final int MULTIPLE_LOOP = 4;
    static private final int MULTIPLICATION_LOOP = NUMBER_LOOP * MULTIPLE_LOOP;

    @SneakyThrows
    public static void main(String[] args) {

        var phaser = new Phaser(MULTIPLE_LOOP);
        var semaph = new Semaphore(MULTIPLE_LOOP / 2 + 1);
        var cycliB = new CyclicBarrier(MULTIPLICATION_LOOP);
        var countL = new CountDownLatch(MULTIPLICATION_LOOP);

        new ThreadForEmpCountL(countL);

//        ExecutorService executorService = Executors.newFixedThreadPool(multiple*4);
        ExecutorService executorService = Executors.newWorkStealingPool();

        for (int i = 0; i < MULTIPLICATION_LOOP; i++) {

            executorService.submit(new EmpPhaser(phaser));
            executorService.submit(new EmpSemaph(semaph));
            executorService.submit(new EmpCountL(countL));
            // Барьер нельзя запускать в executor, если ожидающих потоков больше количества потоков в executor
            new EmpCycliB(cycliB);

        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("---------------------------------------");
        Thread.sleep(1_000);
        System.out.println("---------------------------------------");
        
    }

    static class JobMock {

        static void go() {
            JobMock.go("");
        }

        static void go(String s1) {
            JobMock.go(s1, "");
        }


        @SneakyThrows
        static void go(String s1, String s2) {
            String sb = "BeginJob";
            String se = "EndJob";
            String st = Thread.currentThread().getName();
            int random = ThreadLocalRandom.current().nextInt(MIN_MIL_SEC_PAUSE, MAX_MIL_SEC_PAUSE);

            System.out.printf(FORMAT, st, s1, s2, sb);
            Thread.sleep(random);
            System.out.printf(FORMAT, st, s1, s2, se);
        }

    }

    static class EmpPhaser extends Thread {
        Phaser phaser;

        public EmpPhaser(Phaser phaser) {
            this.phaser = phaser;
        }

        @SneakyThrows
        public void run() {
            String st = Thread.currentThread().getName();
            JobMock.go("Phaser", "Подготовка комплекта постельного белья");
            phaser.arriveAndAwaitAdvance();
            System.out.printf(FORMAT, st, "Phaser", "Комплект постельного белья подготовлен", "");
            Thread.sleep(100);
        }
    }

    static class EmpSemaph extends Thread {
        Semaphore semaph;

        public EmpSemaph(Semaphore semaph) {
            this.semaph = semaph;
//            this.start();
        }

        @SneakyThrows
        public void run() {
            String st = Thread.currentThread().getName();
            semaph.acquire();
            JobMock.go("Semaph", "Очередь: " + semaph.getQueueLength());
            semaph.release();
        }
    }

    static class EmpCountL extends Thread {

        CountDownLatch countL;

        public EmpCountL(CountDownLatch countL) {
            this.countL = countL;
//            this.start();
        }

        public void run() {
            String st = Thread.currentThread().getName();
            JobMock.go("CountL", "Сбор части товара");
            countL.countDown();
        }
    }

    static class ThreadForEmpCountL extends Thread {
        CountDownLatch countL;

        public ThreadForEmpCountL(CountDownLatch countL) {
            this.countL = countL;
            this.start();
        }

        @SneakyThrows
        public void run() {
            String st = Thread.currentThread().getName();
            System.out.printf(FORMAT, st, "CountL", "Жду окончание сбора товара", "");
            countL.await();
            System.out.printf(FORMAT, st, "CountL", "Товар полностью собран", "");
        }
    }

    static class EmpCycliB extends Thread {
        CyclicBarrier cycliB;

        @SneakyThrows
        public EmpCycliB(CyclicBarrier cycliB) {
            this.cycliB = cycliB;
            this.start();
        }

        @SneakyThrows
        public void run() {
            String st = Thread.currentThread().getName();
            int random = ThreadLocalRandom.current().nextInt(MIN_MIL_SEC_PAUSE * MULTIPLE_LOOP, MAX_MIL_SEC_PAUSE * MULTIPLE_LOOP * 10);

            Thread.sleep(random);
            JobMock.go("CycliB", "Иду до барьера");
            System.out.printf(FORMAT, st, "CycliB", "Дальше барер", "");
            cycliB.await();
            System.out.printf(FORMAT, st, "CycliB", "Барер снят", "");
        }

    }

}


