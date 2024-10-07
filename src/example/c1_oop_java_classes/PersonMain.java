package example.c1_oop_java_classes;


public class PersonMain {             // Основной класс
    String nameMain;
    PersonInner personInner;
    PersonStaticNested personStaticNested;

    public PersonMain(String name, PersonStaticNested personStaticNested) {
        this.nameMain = name;
        this.personInner = new PersonInner("PersonInner");
        this.personStaticNested = personStaticNested;
    }

    class PersonInner {               // Внутренний класс
        String nameInner;

        public PersonInner(String nameInner) {
            this.nameInner = nameInner;
        }
    }

    static class PersonStaticNested { // Вложенный класс (т.к. static)
        String nameStaticNested;

        public PersonStaticNested(String nameStaticNested) {
            this.nameStaticNested = nameStaticNested;
        }
    }

    void info() {
        class PersonLocal {          // Локальный класс (т.к. в методе)
            String nameLocal;

            public PersonLocal(String nameLocal) {
                this.nameLocal = nameLocal;
            }
        }

        PersonLocal personLocal = new PersonLocal("PersonLocal");

        Runnable runnable = new Runnable() { // Анонимный класс (создаётся экземпляр безымянного класса наследника Runnable)
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        };

        runnable.run();

        System.out.println("info");
        System.out.println("this.nameMain                       = " + this.nameMain);
        System.out.println("personInner.nameInner               = " + personInner.nameInner);
        System.out.println("personStaticNested.nameStaticNested = " + personStaticNested.nameStaticNested);
        System.out.println("personLocal.nameLocal               = " + personLocal.nameLocal);

    }
}
