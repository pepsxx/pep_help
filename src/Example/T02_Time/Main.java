package Example.T02_Time;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        long t11, t12 , t13;
        long t21, t22 , t23;

        String string = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        t11 = System.currentTimeMillis();
        t21 = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            string += i;
        }
        t12 = System.currentTimeMillis();
        t22 = System.nanoTime();
        t13 = t12 - t11;
        t23 = t22 - t21;
        System.out.println("string        - t13 currentTimeMillis = " + t13);
        System.out.println("string        - t23 nanoTime          = " + t23);




        t11 = System.currentTimeMillis();
        t21 = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append(i);
        }
        t12 = System.currentTimeMillis();
        t22 = System.nanoTime();
        t13 = t12 - t11;
        t23 = t22 - t21;
        System.out.println("stringBuilder - t13 currentTimeMillis = " + t13);
        System.out.println("stringBuilder - t23 nanoTime          = " + t23);




        t11 = System.currentTimeMillis();
        t21 = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            stringBuffer.append(i);
        }
        t12 = System.currentTimeMillis();
        t22 = System.nanoTime();
        t13 = t12 - t11;
        t23 = t22 - t21;
        System.out.println("stringBuffer  - t13 currentTimeMillis = " + t13);
        System.out.println("stringBuffer  - t23 nanoTime          = " + t23);
    }
}