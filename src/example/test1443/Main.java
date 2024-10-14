package example.test1443;

import lombok.SneakyThrows;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-------------------------");

        Object o1 = new Object();
        Object o2 = new Object();
//        Object o2 = o1;

        Th th1 = new Th("1", o1);
        Th th2 = new Th("2", o2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();
        System.out.println("-------------------------");
    }


}

class Th extends Thread {
    String s;
    Object o;

    public Th(String s, Object o) {
        this.s = s;
        this.o = o;
    }

    @SneakyThrows
    @Override
    public void run() {
        test(s);
    }

    public void test(String s) throws InterruptedException {
        synchronized (o) {
            System.out.println(s + " - Start");
            Thread.sleep(1_000);
            System.out.println(s + " - Stop");
        }
    }
}
