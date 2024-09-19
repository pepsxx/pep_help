package example.c1_java_reference;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("""
                Strong  reference   - Сильная
                Soft    reference   - Мягкие
                Weak    reference   - Слабые
                Phantom reference   - Фантомные""");

        Counter counterStrong = new Counter("counterStrong");
        Counter counterToSoft = new Counter("counterToSoft");
        Counter counterToWeak = new Counter("counterToWeak");
        Counter counterToPhan = new Counter("counterToPhan");

        Counter StrongRef = counterStrong;
        SoftReference<Counter> softRef = new SoftReference<>(counterToSoft);
        WeakReference<Counter> weakRef = new WeakReference<>(counterToWeak);

        ReferenceQueue<Counter>   queue = new ReferenceQueue<>();
        PhantomReference<Counter> phanRef = new PhantomReference<>(counterToPhan, queue);


        info(StrongRef, softRef, weakRef);
        counterStrong = null;
        counterToSoft = null;
        counterToWeak = null;
        counterToPhan = null;

        List<Object> list = new ArrayList<>();
        while (softRef.get() != null) {
            info(StrongRef, softRef, weakRef);
            Thread.sleep(1_000);

            phanRef.get();

            for (int i = 0; i < 10_000_000; i++) {
                list.add(new Object());
            }
        }

        info(StrongRef, softRef, weakRef);

        if (queue.poll() != null) {
            System.out.println("PhantomReference = Проверив очередь для фантомных ссылок, можно выполнить действие если объект был помечен на удаление");
        }

    }

    private static void info(Counter counter, SoftReference<Counter> softRef, WeakReference<Counter> weakRef) {
        System.out.println();
        System.out.printf("StrongReference  = %-30s No Del%n", counter);
        System.out.printf("SoftReference    = %-30s Del when JVM memory is low%n", softRef.get());
        System.out.printf("WeakReference    = %-30s Del for first GC running%n", weakRef.get());
    }

}

@ToString
@AllArgsConstructor
class Counter {

    private String name;

}