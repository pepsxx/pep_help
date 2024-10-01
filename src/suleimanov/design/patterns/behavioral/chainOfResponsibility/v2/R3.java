package suleimanov.design.patterns.behavioral.chainOfResponsibility.v2;

public class R3 implements Redactor {

    Redactor nextRedactor;

    @Override
    public void setNext(Redactor redactor) {
        nextRedactor = redactor;
    }

    @Override
    public void redact(String string) {
        string = string + " R3";
        System.out.println(string);
        if (nextRedactor != null) {
            nextRedactor.redact(string);
        }
    }
}
