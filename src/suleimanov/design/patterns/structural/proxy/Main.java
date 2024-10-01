package suleimanov.design.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создание объекта при жадной загрузке");
        Project project1 = new ProjectReal("http://t1.ru");
        System.out.println("Запуск метода при жадной загрузке");
        project1.run();
        System.out.println("-------------------------");

        System.out.println("Создание объекта при ленивой загрузке");
        Project project2 = new ProjectProxy("http://t1.ru");
        System.out.println("Запуск метода при ленивой загрузке");
        project2.run();
        System.out.println("-------------------------");

    }
}
