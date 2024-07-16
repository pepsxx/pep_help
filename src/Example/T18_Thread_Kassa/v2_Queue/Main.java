package Example.T18_Thread_Kassa.v2_Queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----------------------------------------------------------------------------------------");
        Queue<Kass> kasses = new ArrayDeque<>(List.of(new Kass(), new Kass(), new Kass()));
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
