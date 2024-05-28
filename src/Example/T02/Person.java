package Example.T02;

import java.util.ArrayList;
import java.util.List;

public class Person<T> {
    T name;

    T getName() {
        return this.name;
    }

    public <M> void getM(T name) {
        ArrayList<T> list = new ArrayList<>();
        list.add(name);
    }
}
