package test001;


public class Main {
    public static void main(String[] args) {

        Perent perent = new Perent();
        Perent.test();
        perent.test2();

        Children children = new Children();
        Children.test();
        children.test2();


        Perent o = new Children();
        Perent.test();
        o.test2();

    }
}
