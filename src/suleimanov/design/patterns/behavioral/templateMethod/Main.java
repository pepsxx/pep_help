package suleimanov.design.patterns.behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        PageAbstract welcome = new PageWelcome();
        PageAbstract news = new PageNews();

        welcome.showPage();
        System.out.println("-------------------------");
        news.showPage();
        System.out.println("-------------------------");
    }
}
