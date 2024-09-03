package example.T29_Arg;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String format = "%-40s = %s%n";
//        System.out.printf(format, "xXx", xXx);
        System.out.println("--------------------------------------------------");
        System.out.printf(format, "Arrays.toString(args)", Arrays.toString(args));
        System.out.printf(format, "System.getenv()", System.getenv());
        System.out.printf(format, "System.getProperties()", System.getProperties());
        System.out.printf(format, "System.getProperty(\"sun.cpu.isalist\")", System.getProperty("sun.cpu.isalist"));
        System.out.println("--------------------------------------------------");
    }
}
