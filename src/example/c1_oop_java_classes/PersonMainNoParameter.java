package example.c1_oop_java_classes;


public class PersonMainNoParameter {         // Основной класс

    class PersonInner {                      // Внутренний класс
    }

    static class PersonStaticNested {        // Вложенный класс (т.к. static)
    }

    void info() {
        class PersonLocal {                  // Локальный класс (т.к. в методе)
        }

        Runnable runnable = new Runnable() { // Анонимный класс (создаётся экземпляр безымянного класса наследника Runnable)
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        };

        System.out.println("info");
    }
}
