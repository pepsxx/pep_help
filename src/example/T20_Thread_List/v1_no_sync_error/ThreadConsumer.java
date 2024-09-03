package example.T20_Thread_List.v1_no_sync_error;

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

        int i = 0;
        while (true) {
            int random = ThreadLocalRandom.current().nextInt(0, 10);
            if (!this.list.isEmpty()) {
                list.remove(0);
                System.out.println("      ThreadConsumer List Удаление ");
                System.out.println("      ThreadConsumer List Размер     " + list.size());
            } else {
                System.out.println("      ThreadConsumer List Пустой");
            }
            try {
                Thread.sleep(random);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i++ == 1_000) break;
        }
        System.out.println("Stop  ThreadConsumer---------------------------------------------------------------------");
    }
}
