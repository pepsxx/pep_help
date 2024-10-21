package example.test_code_in_sobes.testRecursion;

public class Main {
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.showNumber(100);
    }
}

class Recursion {
    public void showNumber(int n) {
        if (n == 0) { return; }
        showNumber(n - 1);
        System.out.print(n);
    }
}
