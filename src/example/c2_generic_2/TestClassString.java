package example.c2_generic_2;

public class TestClassString implements TestInterface<String> {


    @Override
    public void m1(String string) {
        System.out.println("string = " + string);
    }

    @Override
    public String m2(String string) {
        return string;
    }

    @Override
    public String m3() {
        return "-=-=-";
    }

    @Override
    public <M> void m4(M m) {
        System.out.println("m = " + m);
    }

    @Override
    public <M> String m5(M m) {
        return m.toString();
    }

    @Override
    public <M> M m6(M m) {
        return m;
    }
}
