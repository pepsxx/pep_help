package test001;

public class New {
    static {
        fun();
    }
    static int id = 1;

    static void fun () {
        throw new RuntimeException();
    }
}
