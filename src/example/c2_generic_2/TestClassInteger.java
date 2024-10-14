package example.c2_generic_2;

public class TestClassInteger implements TestInterface<Integer> {

    @Override
    public void m1(Integer integer) {
        System.out.println("integer = " + integer);
    }

    @Override
    public Integer m2(Integer integer) {
        return integer;
    }

    @Override
    public Integer m3() {
        return 3;
    }

    @Override
    public <M> void m4(M m) {
        System.out.println("m = " + m);
    }

    @Override
    public <M> Integer m5(M m) {
        return 5;
    }

    @Override
    public <M> M m6(M m) {
        return m;
    }
}
