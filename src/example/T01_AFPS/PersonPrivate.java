package example.T01_AFPS;

class PersonPrivate {                      // private - ----- - (Не сможем обратиться к нему).

    {                                      // private - -----.
        System.out.println("---------- Блок инициализации---------- ");
    }

    private String name;                   // private - Ok (Доступен только в этом классе)

    private PersonPrivate(String name) {   // private - Ok (Доступен только в этом классе)
        this.name = name;
    }

    private String getName() {             // private - Ok (Доступен только в этом классе)
        return this.name;
    }

    static PersonPrivate getInstance(String name) {  // Пример как можно получить доступ к приватному конструктору и методу
        PersonPrivate personPrivate = new PersonPrivate(name);
        System.out.println("personPrivate.getName() = " + personPrivate.getName());
        return personPrivate;
    }
}
