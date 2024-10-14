package example.c2_generic_2;

public class TestMethod {

    public <M> void info(M m) {
        System.out.println(m);
    }

    public <M> M infoReturn(M m) {
        System.out.print("Return1: ");
        return m;
    }

    public static <M> void infoStatic(M m) {
        System.out.println(m);
    }

    public static <M> M infoStaticReturn(M m) {
        System.out.print("Return2: ");
        return m;
    }
}
