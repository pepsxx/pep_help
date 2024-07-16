package Example.T18_Thread_Kassa.v3_BlockingQueue;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------------");
        BlockingQueue<Kass> kasses = new ArrayBlockingQueue<>(3,true, List.of(new Kass(), new Kass(), new Kass()));
        List<Thread> threads = Stream.of(
                        new User(kasses),
                        new User(kasses),
                        new User(kasses),
                        new User(kasses),
                        new User(kasses),
                        new User(kasses),
                        new User(kasses),
                        new User(kasses),
                        new User(kasses),
                        new User(kasses)
                )
                .map(Thread::new)
                .peek(Thread::start)
                .toList();

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
