package test001;

public interface In3 extends Interface1, Interface2 {
    @Override
    default void soud() {
        Interface1.super.soud();
    }
}
