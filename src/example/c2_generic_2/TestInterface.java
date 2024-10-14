package example.c2_generic_2;

public interface TestInterface<I> {

    void m1(I i);

    I m2(I i);

    I m3();

    <M> void m4(M m);

    <M> I m5(M m);

    <M> M m6(M m);


}
