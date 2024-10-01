package suleimanov.design.patterns.structural.composite.v2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Product product1 = new Product(1000);
        Product product2 = new Product(200);
        Product product3 = new Product(100);
        Product product4 = new Product(30);
        Product product5 = new Product(20);
        Product product6 = new Product(10);

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box3.addOrder(product1);
        box3.addOrder(product2);
        box3.addOrder(product3);

        box2.addOrder(product4);
        box2.addOrder(product5);
        box2.addOrder(box3);

        box1.addOrder(product6);
        box1.addOrder(box2);

        int sum = box1.getSum();

        System.out.println("sum = " + sum);

    }
}
