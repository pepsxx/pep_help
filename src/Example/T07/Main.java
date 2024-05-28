package Example.T07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int[] ints = {1, 2, 3};

        viw(i, ints);

        test1();
    }

    private static boolean viw(int i, int[] ints) {
        return false;
    }

    private static void test1() {
        int i = 0;
        int[] ints = new int[5];
        intUpdate(i);
        intMasUpdate(ints);

        System.out.println("ints  = " + ints);


        System.out.println("i = " + i);
        System.out.println("ints = " + Arrays.toString(ints));
    }

    public static void intMasUpdate (int[] iints){
        iints[0] = 1;
        System.out.println("iints = " + iints);
    }
    public static void intUpdate (int ii){
        ii++;
        System.out.println("ii = " + ii);
    }

}
