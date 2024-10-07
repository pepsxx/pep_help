package example.c1_oop_java_classes;

public class Main {
    public static void main(String[] args) {
        PersonMain personMain = new PersonMain("PersonMain", new PersonMain.PersonStaticNested("PersonStaticNested"));
        personMain.info();
    }
}
