package suleimanov.design.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                https://www.youtube.com/watch?v=vyr9GO7dLBQ
                
                Одиночка — это порождающий паттерн проектирования, который гарантирует, 
                что у класса есть только один экземпляр, 
                и предоставляет к нему глобальную точку доступа.""");


        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
        System.out.println("connectDB = " + ConnectDB.getInstance()); // всегда получаем один и тот же объект
    }
}
