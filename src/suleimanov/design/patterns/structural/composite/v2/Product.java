package suleimanov.design.patterns.structural.composite.v2;

public class Product implements Order {

    public Product(int price) {
        this.price = price;
    }

    private int price;

    @Override
    public int getSum() {
        System.out.println("Смотрю стоимость " + this.toString() + " = " + this.price);
        return this.price;
    }
}
