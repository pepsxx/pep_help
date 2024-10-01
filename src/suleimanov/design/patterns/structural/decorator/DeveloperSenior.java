package suleimanov.design.patterns.structural.decorator;

public class DeveloperSenior extends DeveloperDecorator {

    public DeveloperSenior(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Week Report";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " & " + sendWeekReport();
    }

}
