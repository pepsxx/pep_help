package suleimanov.design.patterns.structural.decorator;

public class DeveloperMiddle extends DeveloperDecorator {

    public DeveloperMiddle(Developer developer) {
        super(developer);
    }

    public String makeReview(){
        return "Make Review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() +" & " + makeReview();
    }
}
