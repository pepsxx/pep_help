package Example.T01_AFPS;

public class Main {
    public static void main(String[] args) {

        //Person
        Person person = new Person("person");
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person = " + person);

        //PersonAbstract & PersonAbstractExtends
        PersonAbstractExtends personAbstractExtends = new PersonAbstractExtends("personAbstractExtends");
        System.out.println("personAbstractExtends.getName() = " + personAbstractExtends.getName());
        System.out.println("personAbstractExtends = " + personAbstractExtends);

        //PersonFinal
        PersonFinal personFinal = new PersonFinal("personFinal");
        System.out.println("personFinal.getName() = " + personFinal.getName());
        System.out.println("personFinal = " + personFinal);

        //PersonPrivate
        PersonPrivate personPrivate = PersonPrivate.getInstance("PersonPrivate");
        System.out.println("personPrivate = " + personPrivate);

        //PersonStatic
        PersonStatic personStatic = new PersonStatic("personStatic");
        System.out.println("PersonStatic.getName() = " + PersonStatic.getName());
        System.out.println("personStatic = " + personStatic);


    }
}
