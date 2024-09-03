package example.T01_AFPS;

class Person {

    {
        System.out.println("---------- Блок инициализации---------- ");
    }

    String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
