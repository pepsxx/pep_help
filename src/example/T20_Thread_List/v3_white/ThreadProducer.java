package example.T20_Thread_List.v3_white;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadProducer implements Runnable {
    List<Integer> list;

    public ThreadProducer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("Start ThreadProducer---------------------------------------------------------------------");
        while (true) {
            int random = ThreadLocalRandom.current().nextInt(0, 10);
            synchronized (list) {
                if (this.list.size() < 10) {
                    list.add(random);
                    System.out.println("      ThreadProducer List Добавление");
                    System.out.println("      ThreadProducer List Размер     " + list.size());
                } else {
                    System.out.println("      ThreadProducer List Переполнен");
                }
                try {
                    System.out.println("      ThreadProducer Спит " + random);
                    list.notify();
                    list.wait(random);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
