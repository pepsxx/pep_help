package example.c2_generic_2;

public class TestClassInterface<I> implements TestInterface<I> {


    @Override
    public void m1(I i) {
        System.out.println("i = " + i);
    }

    @Override
    public I m2(I i) {
        return i;
    }

    @Override
    public I m3() {
        return null;
    }

    @Override
    public <M> void m4(M m) {
        System.out.println("m = " + m);
    }

    @Override
    public <M> I m5(M m) {
        return null;
    }

    @Override
    public <M> M m6(M m) {
        return m;
    }
}
