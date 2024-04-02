package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        System.out.println("-=-+-=-");
        allEat(a1);
        allEat(d1);
        allEat(c1);
        System.out.println("-=----=-");
    }
    public static void allEat (Animal te){
    te.eat();
    }
}
