package example.T08_Enum;

public enum Type {            // Будто бы абстрактный класс
    // Нельзя наследоваться и быть наследником от enum
    // Можно имплементировать интерфейсы

    BIT_32("32 бита") { // Будто бы наследники класса

        @Override
        void info() {
            System.out.println("Устаревшая архитектура");
        }
    },
    BIT_64("64 бита") { // Будто бы наследники класса

        @Override
        void info() {
            System.out.println("Современная архитектура");
        }
    };

    String name;

    Type(String name) {
        this.name = name;
    }

    abstract void info(); // Можно создавать абстрактные методы

    public String getName() {
        return name;
    }
}
