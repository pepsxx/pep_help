package example.test_code_in_sobes.t004;

class Main {
    public static void main(String[] args) {
        new B();
    }
}

class A {

    public A() {
        print();
    }

    public void print() {
        System.out.println("From A");
    }
}

class B extends A {

    private double pi = Math.PI; // если static или final, то значение будет определено до вызова конструктора

    public B() {
        print();
    }

    public void print() {
        System.out.println(pi);
    }
}