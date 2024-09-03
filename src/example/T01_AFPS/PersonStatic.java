package example.T01_AFPS;

class PersonStatic {                      // static - -----.

    static {                              // static - Ok - Выполняется один раз.
        System.out.println("---------- Блок инициализации---------- ");
    }

    static String name;                   // static - Ok - Поле не экземпляра класса, а класса.

    PersonStatic(String name) {           // static -  -----.
        this.name = name;
    }

    static String getName() {             // static - Ok - Метод не экземпляра класса, а класса.
        return name;
    }
}
