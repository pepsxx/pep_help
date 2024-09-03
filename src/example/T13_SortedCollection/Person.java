package example.T13_SortedCollection;

public class Person implements Comparable<Person> {
    private int id;

    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Person o) {
        if (this.id < o.id) {
            return -1;
        } else if (this.id > o.id) {
            return 1;
        } else return 0;

    }

    // to String

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    // Set-Get

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
