package Example.T01;

import java.util.List;

final class PersonFinal {                        // final - Запрещает наследование
    final String name;                           // final - запрещает изменение после инициализации
    List<String> names;                          // final - запрещает изменение размера после инициализации

    public PersonFinal(String name) {            // final - Нельзя
        this.name = name;
    }

    public final String getName() {              // final - Запрещено переопределение
        return this.name;
    }
}
