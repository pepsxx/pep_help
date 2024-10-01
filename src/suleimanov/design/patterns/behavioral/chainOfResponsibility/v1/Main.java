package suleimanov.design.patterns.behavioral.chainOfResponsibility.v1;

public class Main {
    public static void main(String[] args) {

        Notifier notifierAll = new NotifierAll(1);
        Notifier notifierMedium = new NotifierMedium(2);
        Notifier notifierHigh = new NotifierHigh(3);

        notifierAll.setNextNnotifier(notifierMedium);
        notifierMedium.setNextNnotifier(notifierHigh);

        notifierAll.notifyManager("Everything id Ok", 1);
        System.out.println("-------------------------");
        notifierAll.notifyManager("Everything id Norm", 2);
        System.out.println("-------------------------");
        notifierAll.notifyManager("Everything id Bad", 3);


    }
}
