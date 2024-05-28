package Example.T01_PSF;

class PersonPrivate {                      // Private - не может быть (Не сможем обратиться к нему)
    private String name;                   // Private - Ok (Виден только в этом классе)

    private PersonPrivate(String name) {   // Private - Ok (Виден только в этом классе)
        this.name = name;
    }

    private String getName() {             // Private - Ok (Виден только в этом классе)
        return this.name;
    }

    static PersonPrivate getInstance(String name) {  // Пример как можно получить доступ к конструктору
        return new PersonPrivate(name);
    }
}
