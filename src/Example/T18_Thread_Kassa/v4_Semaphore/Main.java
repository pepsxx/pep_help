package Example.T18_Thread_Kassa.v4_Semaphore;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------------");
        Semaphore kasses = new Semaphore(3);
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
