package example.c2_generic_2;

public class Main {

    public static void main(String[] args) {

        System.out.println("-= Class =-");
        TestClass<String> testFieldString = new TestClass<>();
        TestClass<Integer> testFieldInteger = new TestClass<>();
        testFieldString.setC("Hello");
        testFieldInteger.setC(1);
        System.out.println("testFieldString.getT() = " + testFieldString.getC());
        System.out.println("testFieldInteger.getT() = " + testFieldInteger.getC());
        System.out.println("-------------------------");

        System.out.println("-= Method =-");
        TestMethod testMethod = new TestMethod();
        TestMethod.infoStatic(new Object());
        testMethod.info("Hello to test in here");
        System.out.println("testMethod.infoReturn(\"s1\") = " + testMethod.infoReturn("s1"));
        System.out.println("TestMethod.infoStaticReturn(new Object()) = " + TestMethod.infoStaticReturn(new Object()));
        System.out.println("-------------------------");


        TestClassString testClassString = new TestClassString();
        TestClassInteger testClassInteger = new TestClassInteger();
        TestClassInterface<Double> testClassInterface = new TestClassInterface<>();

        testClassString.m1("sm1");
        String sm2 = testClassString.m2("sm2");
        System.out.println("sm2 = " + sm2);
        String sm3 = testClassString.m3();
        System.out.println("sm3 = " + sm3);
        testClassString.m4(new Object());
        String sm5 = testClassString.m5(new Object());
        System.out.println("sm5 = " + sm5);
        Object sm6 = testClassString.m6(new Object());
        System.out.println("sm6 = " + sm6);
        System.out.println("-------------------------");

        testClassInteger.m1(1);
        Integer im2 = testClassInteger.m2(2);
        System.out.println("im2 = " + im2);
        Integer im3 = testClassInteger.m3();
        System.out.println("im3 = " + im3);
        testClassInteger.m4(new Object());
        Integer im5 = testClassInteger.m5(new Object());
        System.out.println("im5 = " + im5);
        Object im6 = testClassInteger.m6(new Object());
        System.out.println("im6 = " + im6);
        System.out.println("-------------------------");

        testClassInterface.m1(1.1);
        Double dm2 = testClassInterface.m2(2.2);
        System.out.println("dm2 = " + dm2);
        Double dm3 = testClassInterface.m3();
        System.out.println("dm3 = " + dm3);
        testClassInterface.m4(new Object());
        Double dm5 = testClassInterface.m5(new Object());
        System.out.println("dm5 = " + dm5);
        Object dm6 = testClassInterface.m6(new Object());
        System.out.println("dm6 = " + dm6);
        System.out.println("-------------------------");

    }

}
