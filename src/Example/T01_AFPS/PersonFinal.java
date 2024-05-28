package Example.T01_AFPS;

final class PersonFinal {                        // final - Запрещает - Наследование.

    {                                            // final - -----.
        System.out.println("---------- Блок инициализации---------- ");
    }

    final String name;                           // final - Запрещает - Изменение после инициализации.

    PersonFinal(String name) {                   // final - -----.
        this.name = name;
    }

    final String getName() {                      // final - Запрещает - переопределение (в данном примере бессмысленен так как у класса не может быть наследников).
        return this.name;
    }
}
