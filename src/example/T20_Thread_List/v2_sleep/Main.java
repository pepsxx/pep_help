package example.T20_Thread_List.v2_sleep;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Start-------------------------------------------------------------------------------");
        List<Integer> list = new LinkedList<>();
        Thread ThreadConsumer = new Thread(new ThreadConsumer(list), "ThreadConsumer");
        Thread ThreadProducer = new Thread(new ThreadProducer(list), "ThreadProducer");
        ThreadProducer.start();
        ThreadConsumer.start();
        ThreadProducer.join();
        ThreadConsumer.join();
        System.out.println("Main  Stop-------------------------------------------------------------------------------");
    }
}
