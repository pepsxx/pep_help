package Example.T06_Interfase;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Person.YEAR = " + Person.YEAR);
        System.out.println("------------------------------------------------------------------------------------------");
        person.print();
        System.out.println("------------------------------------------------------------------------------------------");
        person.printDefault();
        System.out.println("------------------------------------------------------------------------------------------");
        TestInterfaceMain.printStatic();
        System.out.println("------------------------------------------------------------------------------------------");
    }

}
