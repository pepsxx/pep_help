package test001;

public class Children extends Perent {
    static void test() {
        System.out.println("Child Test");
    }
    public Children test2 ()
    {
        System.out.println("Child Test 2");
        return this;
    }
}
