package example.c1_oop_binding;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Перегрузка передает в метод переменную по типу ссылки переменной            - Раннее связывание");
        System.out.println("Статические методы связываются с классом по типу ссылки переменной          - Раннее связывание");
        System.out.println("Переопределение не статические методы связываются с классом типу реализации - Позднее связывание");
        System.out.println();

        List listArrayList = new ArrayList();
        ArrayList arrayListArrayList = new ArrayList();

        Parent pp = new Parent();
        Parent pc = new Child();
        Child cc = new Child();

        System.out.println("Parent pp = new Parent();");
        pp.virtualMethod(listArrayList);
        pp.staticMethod(listArrayList);
        pp.virtualMethod(arrayListArrayList);
        pp.staticMethod(arrayListArrayList);
        System.out.println();

        System.out.println("Parent pc = new Child();");
        pc.virtualMethod(listArrayList);
        pc.staticMethod(listArrayList);
        pc.virtualMethod(arrayListArrayList);
        pc.staticMethod(arrayListArrayList);
        System.out.println();

        System.out.println("Child cc = new Child();");
        cc.virtualMethod(listArrayList);
        cc.staticMethod(listArrayList);
        cc.virtualMethod(arrayListArrayList);
        cc.staticMethod(arrayListArrayList);
        System.out.println();

    }
}

class Parent {
    static void staticMethod(List l) {
        System.out.println("Parent staticMethod  List");
    }

    static void staticMethod(ArrayList l) {
        System.out.println("Parent staticMethod  ArrayList");
    }

    void virtualMethod(List l) {
        System.out.println("Parent virtualMethod List");
    }

    void virtualMethod(ArrayList l) {
        System.out.println("Parent virtualMethod ArrayList");
    }
}

class Child extends Parent {
    static void staticMethod(List l) {
        System.out.println("Child  staticMethod  List");
    }

    static void staticMethod(ArrayList l) {
        System.out.println("Child  staticMethod  ArrayList");
    }

    void virtualMethod(List l) {
        System.out.println("Child  virtualMethod List");
    }

    void virtualMethod(ArrayList l) {
        System.out.println("Child  virtualMethod ArrayList");
    }
}
