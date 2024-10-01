package suleimanov.design.patterns.behavioral.chainOfResponsibility.v1;

public class NotifierAll extends Notifier{

    public NotifierAll(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Report low:    " + message);
    }
}
