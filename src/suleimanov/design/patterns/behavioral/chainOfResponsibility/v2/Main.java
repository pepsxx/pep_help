package suleimanov.design.patterns.behavioral.chainOfResponsibility.v2;

public class Main {
    public static void main(String[] args) {
        Redactor r1 = new R1();
        Redactor r2 = new R2();
        Redactor r3 = new R3();


        r1.setNext(r2);
        r2.setNext(r3);
        r3.setNext(null);
        r1.redact("Test1");
        System.out.println("-------------------------");
        r1.setNext(r3);
        r3.setNext(r2);
        r2.setNext(null);
        r1.redact("Test2");

    }
}
