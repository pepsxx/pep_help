package Test001;

public class Children extends Person implements Interface1 {

    public static void test () {
        System.out.println("Children");
    }
    @Override
    public void info() {
       super.info();
       System.out.println("id = " + id + "; name = " + name);
    }


    static class Ch2 {}

}


