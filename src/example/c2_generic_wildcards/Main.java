package example.c2_generic_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------");
        System.out.println("Наследование от предка к наследники");
        System.out.println("Object -> Obj1 -> Obj2 -> Obj3");

        Object o = new Object();

        Obj1 o1 = new Obj1();
        Obj2 o2 = new Obj2();
        Obj3 o3 = new Obj3();

        List<Obj1> listObj1 = new ArrayList<>();
        List<Obj2> listObj2 = new ArrayList<>();
        List<Obj3> listObj3 = new ArrayList<>();

        listObj1.add(o1);
        listObj2.add(o2);
        listObj3.add(o3);

        Obj1 c1to1 = listObj1.get(0); // Cast 1 to 1 +
//      Obj2 c1to2 = listObj1.get(0); // Cast 1 to 2 -
//      Obj3 c1to3 = listObj1.get(0); // Cast 1 to 3 -

        Obj1 c2to1 = listObj2.get(0); // Cast 2 to 1 +
        Obj2 c2to2 = listObj2.get(0); // Cast 2 to 2 +
//      Obj3 c2to3 = listObj2.get(0); // Cast 2 to 3 -

        Obj1 c3to1 = listObj3.get(0); // Cast 3 to 1 +
        Obj2 c3to2 = listObj3.get(0); // Cast 3 to 2 +
        Obj3 c3to3 = listObj3.get(0); // Cast 3 to 3 +

        List<? extends Obj1> listObj1ext1 = listObj1; // Верхняя граница O1 - в листе O1 +
        List<? extends Obj1> listObj2ext1 = listObj2; // Верхняя граница O1 - в листе O2 +
        List<? extends Obj1> listObj3ext1 = listObj3; // Верхняя граница O1 - в листе O3 +

//      List<? extends Obj2> listObj1ext2 = listObj1; // Верхняя граница O2 - в листе O1 -
        List<? extends Obj2> listObj2ext2 = listObj2; // Верхняя граница O2 - в листе O2 +
        List<? extends Obj2> listObj3ext2 = listObj3; // Верхняя граница O2 - в листе O3 +

//      List<? extends Obj3> listObj1ext3 = listObj1; // Верхняя граница O3 - в листе O1 -
//      List<? extends Obj3> listObj2ext3 = listObj2; // Верхняя граница O3 - в листе O2 -
        List<? extends Obj3> listObj3ext3 = listObj3; // Верхняя граница O3 - в листе O3 +

//      listObj1ext1.add(new Obj1()); // Добавлять -
//      listObj1ext1.add(new Obj2()); // Добавлять -
//      listObj1ext1.add(new Obj3()); // Добавлять -

//      listObj2ext1.add(new Obj1()); // Добавлять -
//      listObj2ext1.add(new Obj2()); // Добавлять -
//      listObj2ext1.add(new Obj3()); // Добавлять -

//      listObj3ext1.add(new Obj1()); // Добавлять -
//      listObj3ext1.add(new Obj2()); // Добавлять -
//      listObj3ext1.add(new Obj3()); // Добавлять -

//      listObj2ext2.add(new Obj1()); // Добавлять -
//      listObj2ext2.add(new Obj2()); // Добавлять -
//      listObj2ext2.add(new Obj3()); // Добавлять -

//      listObj3ext2.add(new Obj1()); // Добавлять -
//      listObj3ext2.add(new Obj2()); // Добавлять -
//      listObj3ext2.add(new Obj3()); // Добавлять -

//      listObj3ext3.add(new Obj1()); // Добавлять -
//      listObj3ext3.add(new Obj2()); // Добавлять -
//      listObj3ext3.add(new Obj3()); // Добавлять -

        listObj1ext1.add(null); // Исключение


        Obj1 o1l1e1 = listObj1ext1.get(0); // не ниже 1 +
//      Obj2 o2l1e1 = listObj1ext1.get(0); // не ниже 1 -
//      Obj3 o3l1e1 = listObj1ext1.get(0); // не ниже 1 -

        Obj1 o1l2e1 = listObj2ext1.get(0); // не ниже 1 +
//      Obj2 o2l2e1 = listObj2ext1.get(0); // не ниже 1 -
//      Obj3 o3l2e1 = listObj2ext1.get(0); // не ниже 1 -

        Obj1 o1l3e1 = listObj3ext1.get(0); // не ниже 1 +
//      Obj2 o2l3e1 = listObj3ext1.get(0); // не ниже 1 -
//      Obj3 o3l3e1 = listObj3ext1.get(0); // не ниже 1 -


        Obj1 o1l2e2 = listObj2ext2.get(0); // не ниже 2 +
        Obj2 o2l2e2 = listObj2ext2.get(0); // не ниже 2 +
//      Obj3 o3l2e2 = listObj2ext2.get(0); // не ниже 2 -

        Obj1 o1l3e2 = listObj3ext2.get(0); // не ниже 2 +
        Obj2 o2l3e2 = listObj3ext2.get(0); // не ниже 2 +
//      Obj3 o3l3e2 = listObj3ext2.get(0); // не ниже 2 -


        Obj1 o1l3e3 = listObj3ext3.get(0); // не ниже 3 +
        Obj2 o2l3e3 = listObj3ext3.get(0); // не ниже 3 +
        Obj3 o3l3e3 = listObj3ext3.get(0); // не ниже 3 +


        List<? super Obj1> listObj1sup1 = listObj1; // Нижняя граница O1 - в листе O1 +
//      List<? super Obj1> listObj2sup1 = listObj2; // Нижняя граница O1 - в листе O2 -
//      List<? super Obj1> listObj3sup1 = listObj3; // Нижняя граница O1 - в листе O2 -

        List<? super Obj2> listObj1sup2 = listObj1; // Нижняя граница O2 - в листе O1 +
        List<? super Obj2> listObj2sup2 = listObj2; // Нижняя граница O2 - в листе O2 +
//      List<? super Obj2> listObj3sup2 = listObj3; // Нижняя граница O2 - в листе O3 -

        List<? super Obj3> listObj1sup3 = listObj1; // Нижняя граница O3 - в листе O1 +
        List<? super Obj3> listObj2sup3 = listObj2; // Нижняя граница O3 - в листе O2 +
        List<? super Obj3> listObj3sup3 = listObj3; // Нижняя граница O3 - в листе O3 +

        listObj1sup1.add(new Obj1()); // Добавлять от 1 и ниже +
        listObj1sup1.add(new Obj2()); // Добавлять от 1 и ниже +
        listObj1sup1.add(new Obj3()); // Добавлять от 1 и ниже +


//      listObj1sup2.add(new Obj1()); // Добавлять от 2 и ниже -
        listObj1sup2.add(new Obj2()); // Добавлять от 2 и ниже +
        listObj1sup2.add(new Obj3()); // Добавлять от 2 и ниже +

//      listObj2sup2.add(new Obj1()); // Добавлять от 2 и ниже -
        listObj2sup2.add(new Obj2()); // Добавлять от 2 и ниже +
        listObj2sup2.add(new Obj3()); // Добавлять от 2 и ниже +


//      listObj1sup3.add(new Obj1()); // Добавлять от 3 и ниже -
//      listObj1sup3.add(new Obj2()); // Добавлять от 3 и ниже -
        listObj1sup3.add(new Obj3()); // Добавлять от 3 и ниже +

//      listObj2sup3.add(new Obj1()); // Добавлять от 3 и ниже -
//      listObj2sup3.add(new Obj2()); // Добавлять от 3 и ниже -
        listObj2sup3.add(new Obj3()); // Добавлять от 3 и ниже +

//      listObj3sup3.add(new Obj1()); // Добавлять от 3 и ниже -
//      listObj3sup3.add(new Obj2()); // Добавлять от 3 и ниже -
        listObj3sup3.add(new Obj3()); // Добавлять от 3 и ниже +

//      Obj1 o1l1s1 = listObj1sup1.get(0); // читать -
//      Obj2 o2l1s1 = listObj1sup1.get(0); // читать -
//      Obj3 o3l1s1 = listObj1sup1.get(0); // читать -

//      Obj1 o1l2s1 = listObj1sup2.get(0); // читать -
//      Obj2 o2l2s1 = listObj1sup2.get(0); // читать -
//      Obj3 o3l2s1 = listObj1sup2.get(0); // читать -

//      Obj1 o1l3s1 = listObj2sup2.get(0); // читать -
//      Obj2 o2l3s1 = listObj2sup2.get(0); // читать -
//      Obj3 o3l3s1 = listObj2sup2.get(0); // читать -

//      Obj1 o1l2s2 = listObj1sup3.get(0); // читать -
//      Obj2 o2l2s2 = listObj1sup3.get(0); // читать -
//      Obj3 o3l2s2 = listObj1sup3.get(0); // читать -

//      Obj1 o1l3s2 = listObj2sup3.get(0); // читать -
//      Obj2 o2l3s2 = listObj2sup3.get(0); // читать -
//      Obj3 o3l3s2 = listObj2sup3.get(0); // читать -

//      Obj1 o1l3s3 = listObj3sup3.get(0); // читать -
//      Obj2 o2l3s3 = listObj3sup3.get(0); // читать -
//      Obj3 o3l3s3 = listObj3sup3.get(0); // читать -

        Object oooo = listObj1sup1.get(0); // Исключение

        System.out.println("-------------------------");

        test1(listObj1);
        test1(listObj2);
        test1(listObj3);

//      test2(listObj1);
        test2(listObj2);
        test2(listObj3);

        test3(listObj1);
        test3(listObj2);

        System.out.println("listObj1 = " + listObj1);
        System.out.println("listObj2 = " + listObj2);


//      test3(listObj3);

        System.out.println("-------------------------");
        System.out.println("""
                Работа с Object  | ?       | нет ограничения, но какой объект придет неизвестно, поэтому методы только от Object. Можно добавить null, можно вернуть Object
                Хотим возвращать | extends | верхняя граница что может придти o2 o3 | возвращаем o1 o2 | если бы попытались вернуть o3, а пришло o2 ошибка кастинга  | Искл можно добавить null
                Хотим добавлять  |  super  | нижняя  граница что может придти o1 o2 | добавляем  o2 o3 | если бы попытались добавить o1, а пришло o2 ошибка кастинга | Искл можно вернуть Object
                
                extends присваиваем o1 o2 так как пришло o2 o3
                super        пришло o1 o2 можем добавить o2 o3
                """);
    }

    public static void test1(List<?> list) {
        System.out.println("list = " + list);
//      list.add(new Obj2()); // -
        list.add(null);
//      Obj2 oo2 = list.get(0); // -
        Object o = list.get(0);
        System.out.println("-------------------------test1");
    }
    public static void test2(List<? extends Obj2> list) {
        System.out.println("list = " + list);
//      list.add(new Obj2()); // -
        list.add(null);
        Obj2 oo2 = list.get(0);
        Object o = list.get(0);
        System.out.println("-------------------------test2");
    }
    public static void test3(List<? super Obj2> list) {
        System.out.println("list = " + list);
        list.add(new Obj2());
        list.add(new Obj3());
        list.add(null);
//      Obj2 oo2 = list.get(0); // -
        Object o = list.get(0);
        System.out.println("-------------------------test3");
    }
}

