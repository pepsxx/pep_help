package suleimanov.design.patterns.behavioral.chainOfResponsibility.v1;

public class NotifierMedium extends Notifier{
    public NotifierMedium(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("Report Medium: " + message);
    }
}
