package suleimanov.design.patterns.behavioral.chainOfResponsibility.v1;

public abstract class Notifier {
    private int priority;
    private Notifier nextNnotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNnotifier(Notifier nextNnotifier) {
        this.nextNnotifier = nextNnotifier;
    }

    public void notifyManager(String message, int level) {
        if (level >= this.priority) {
            write(message);
        }
        if (nextNnotifier != null) {
            nextNnotifier.notifyManager(message, level);
        }
    }

    protected abstract void write(String message);
}
