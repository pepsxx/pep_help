package Test001;

public class Person implements Interface1, Interface2 {
    // Поля ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected int id;
    protected String name;

    // Конструкторы ////////////////////////////////////////////////////////////////////////////////////////////////////
    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Методы - Set - Get //////////////////////////////////////////////////////////////////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Методы //////////////////////////////////////////////////////////////////////////////////////////////////////////

    protected void info() {
        System.out.println("id = " + id + "; name = " + name);
    }

    public static void test () {
        System.out.println("Person");
    }

    @Override
    public void soud() {
        Interface1.super.soud();
        Interface2.super.soud();
    }
}
