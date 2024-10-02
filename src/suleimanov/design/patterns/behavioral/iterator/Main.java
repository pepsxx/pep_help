package suleimanov.design.patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "Python", "C++"};

        DeveloperJava developerJava = new DeveloperJava("Alex", skills);

        Iterator iterator = developerJava.getIterator();
        System.out.println("developerJava.getName()   = " + developerJava.getName());
        System.out.print("developerJava.getSkills() = ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        Iterator iteratorBack = developerJava.getIteratorBack();
        System.out.print("\ndeveloperJava.getSkills() = ");
        while (iteratorBack.hasNext()) {
            System.out.print(iteratorBack.next() + " ");
        }
    }
}
