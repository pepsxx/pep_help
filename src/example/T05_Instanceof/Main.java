package example.T05_Instanceof;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animalCat = new Cat();
        Animal animalDog = new Dog();

        System.out.println("------------------------------------------------------------------------------------------");

        cat.say();
        dog.say();
        animalCat.say();
        animalDog.say();

        System.out.println("------------------------------------------------------------------------------------------");

//        cat.jump();          работает
//        dog.fas();           работает
//        animalCat.jump(); не работает так как у класса Animal нет такого метода, надо сделать безопасное приведение
//        animalDog.fas();  не работает так как у класса Animal нет такого метода, надо сделать безопасное приведение

        saveJump(cat, dog, animalCat, animalDog);

        System.out.println("------------------------------------------------------------------------------------------");

    }

    public static void saveJump(Animal... animals) {

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).jump();
            } else if (animal instanceof Dog) {
                ((Dog) animal).fas();
            }
        }
    }
}
