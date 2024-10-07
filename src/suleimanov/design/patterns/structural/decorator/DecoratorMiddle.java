package suleimanov.design.patterns.structural.decorator;

public class DecoratorMiddle extends Decorator {

    public DecoratorMiddle(Developer developer) {
        super(developer);
    }

    public String makeReviewBefore(){
        return " Developer Middle ждет код который надо посмотреть...\n";
    }

    public String makeReviewAfter(){
        return " Developer Middle Review code...\n";
    }

    @Override
    public String makeJob() {

        return makeReviewBefore() + super.makeJob() + makeReviewAfter();
    }
}
