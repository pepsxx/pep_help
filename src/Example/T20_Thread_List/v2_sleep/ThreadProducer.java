package Example.T20_Thread_List.v2_sleep;

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
        int i = 0;
        while (true) {
            int random = ThreadLocalRandom.current().nextInt(0, 10);
            synchronized (list) {
                if (this.list.size() < 10) {
                    list.add(random);
                    System.out.println("      ThreadProducer List Добавление " + random);
                    System.out.println("      ThreadProducer List Размер     " + list.size());
                } else {
                    System.out.println("      ThreadProducer List Переполнен");
                }
            }

            try {
                Thread.sleep(random);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (i++ == 1_000) break;
        }
        System.out.println("Stop  ThreadProducer---------------------------------------------------------------------");
    }
}
