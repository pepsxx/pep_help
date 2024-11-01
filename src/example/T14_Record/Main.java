package example.T14_Record;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Описание Class:
                public class PersonClass {
                
                    private String name;
                
                    private int age;
                
                    public PersonClass(String name, int age) {
                        this.name = name;
                        this.age = age;
                    }
                
                    public String getName() {
                        return name;
                    }
                
                        public int getAge() {
                        return age;
                    }
                
                    @Override
                    public boolean equals(Object o) {
                        if (this == o) return true;
                        if (!(o instanceof PersonClass)) return false;
                        PersonClass personClass = (PersonClass) o;
                        return age == personClass.age && Objects.equals(name, personClass.name);
                    }
                
                    @Override
                    public int hashCode() {
                        return Objects.hash(name, age);
                    }
                
                    @Override
                    public String toString() {
                        return "Person{" +
                                "name='" + name + '\\'' +
                                ", age=" + age +
                                '}';
                    }
                }
                --------------------------------------------------""");

        System.out.println("""
                Описание Record:
                public record PersonRecord(String name, int age) {
                }
                --------------------------------------------------""");

        PersonClass person1 = new PersonClass("Class", 1);
        PersonRecord person2 = new PersonRecord("Record", 2);

        System.out.println("person1.getName()  = " + person1.getName());
        System.out.println("person2.name()     = " + person2.name());

        System.out.println("person1.getAge()   = " + person1.getAge());
        System.out.println("person2.age()      = " + person2.age());

        System.out.println("person1            = " + person1);
        System.out.println("person2            = " + person2);

        System.out.println("person1.hashCode() = " + person1.hashCode());
        System.out.println("person2.hashCode() = " + person2.hashCode());

        System.out.println("person1.equals(person2) = " + person1.equals(person2));

    }
}
