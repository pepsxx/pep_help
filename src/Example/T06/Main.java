package Example.T06;

public class Main {

    public static final int INT = 123;
    private static boolean b;
    private static boolean b1;
    private static double x;
    private static boolean bbol;
    private int i;

    public Main() {
        x = 25.67;
    }

    public static void main(String[] args) {
        int a = 11;
        int b = 2;
        int c = 3;

        sum(b, c);

        int value = 10;
        while (value > 0) {
            System.out.println("value = " + value);
            value--;
        }

        int sum = 0;

        a = sum(b, c);
        System.out.println("a = " + a);

    }

    private static int sum(int b, int c) {
        int sum;
        if (b > c) {
            return b;
        } else return c;
    }

}
