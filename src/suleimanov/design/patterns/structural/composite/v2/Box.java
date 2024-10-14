package suleimanov.design.patterns.structural.composite.v2;

import java.util.ArrayList;
import java.util.List;

public class Box implements Order {

    List<Order> orders = new ArrayList<>();

    @Override
    public int getSum() {

        System.out.println("Открываю коробку " + this.toString());

        int sum = 0;

        for (Order order : orders) {
            sum += order.getSum();
        }
        System.out.println("Закрываю коробку " + this.toString());
        return sum;
    }

    void addOrder(Order order) {
        orders.add(order);
    }
}
