package example.T35_Object;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Object o1 = new Object();
        ObjectForClone o2 = new ObjectForClone();

        o1.getClass();
        o1.toString();
        o1.hashCode();
        o1.equals(o2);

        synchronized (o1) {
            o1.wait(); // тут код остановиться.
            o1.notify();
            o1.notifyAll();
        }

        o2.clone(); // Требует implements Cloneable.

        // o1.finalize(); //@Deprecated


    }
}
