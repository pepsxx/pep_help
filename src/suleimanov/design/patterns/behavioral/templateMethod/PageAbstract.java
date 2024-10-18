package suleimanov.design.patterns.behavioral.templateMethod;

public abstract class PageAbstract {
    final public void showPage(){
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    protected abstract void showContent();

}
