package suleimanov.design.patterns.structural.decorator;

public class DecoratorSenior extends Decorator {

    public DecoratorSenior(Developer developer) {
        super(developer);
    }

    public String sendWeekReportBefore() {
        return "Developer Senior пъёт кофе....\n";
    }
    public String sendWeekReportAfter() {return "Developer отправляет отчет...\n";}

    @Override
    public String makeJob() {
        return sendWeekReportBefore() + super.makeJob() + sendWeekReportAfter();
    }

}
