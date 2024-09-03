package example.T07_Classes;

public class Main {
    public static void main(String[] args) {
        PersonMain personMain = new PersonMain("PersonMain", new PersonMain.PersonStaticNested("PersonStaticNested"));
        personMain.info();
    }
}
