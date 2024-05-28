package Example.T01_PSF;

class PersonStatic {                      // Static - не может быть
    static String name;                   // Static - Ok (поле не объекта, а класса)

    PersonStatic(String name) {          // Static - не может быть
        this.name = name;
    }

    static String getName() {             // Static - Ok

        return name;
    }
}
