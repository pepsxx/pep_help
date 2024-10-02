package suleimanov.design.patterns.behavioral.templateMethod;

public class PageWelcome extends PageAbstract {

    @Override
    protected void showContent() {
        System.out.println("Welcome");
    }
}
