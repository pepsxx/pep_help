package suleimanov.design.patterns.behavioral.templateMethod;

public class PageNews extends PageAbstract {

    @Override
    protected void showContent() {
        System.out.println("News");
    }
}
