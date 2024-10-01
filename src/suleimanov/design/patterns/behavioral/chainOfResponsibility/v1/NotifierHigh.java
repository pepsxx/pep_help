package suleimanov.design.patterns.behavioral.chainOfResponsibility.v1;

public class NotifierHigh extends Notifier {
    public NotifierHigh(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Report High:   " + message);
    }
}
