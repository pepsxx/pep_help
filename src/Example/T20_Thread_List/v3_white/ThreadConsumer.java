package Example.T20_Thread_List.v3_white;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadConsumer implements Runnable {
    List<Integer> list;

    public ThreadConsumer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("Start ThreadConsumer---------------------------------------------------------------------");
        while (true) {
            int random = ThreadLocalRandom.current().nextInt(0, 10);
            synchronized (list) {
                if (!this.list.isEmpty()) {
                    list.remove(0);
                    System.out.println("      ThreadConsumer List Удаление");
                    System.out.println("      ThreadConsumer List Размер     " + list.size());
                } else {
                    System.out.println("      ThreadConsumer List Пустой");
                }
                try {
                    System.out.println("      ThreadConsumer Спит " + random);
                    list.notify();
                    list.wait(random);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
