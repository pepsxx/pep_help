package example.T07_immutable;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Main {

    static private final String f1 = "%-40s";

    public static void main(String[] args) {


        Boolean b;

        System.out.printf(f1, "Object: ");
        ObjectTest o1, o2;
        o1 = o2 = new ObjectTest();
        getHashCodes(o1, o1);
        o2.name = "test2";
        b = isImMutable(o1, o2);
        o2 = null;
        isPool(o1, o2, b);

        System.out.printf(f1, "String: ");
        String s1, s2;
        s1 = s2 = "test1";
        getHashCodes(s1, s2);
        s2 = "test2";
        b = isImMutable(s1, s2);
        s2 = "test1";
        isPool(s1, s2, b);


        System.out.printf(f1, "Byte: ");
        Byte by1, by2;
        by1 = by2 = 1;
        getHashCodes(by1, by2);
        by2 = 2;
        b = isImMutable(by1, by2);
        by2 = 1;
        isPool(by1, by2, b);

        System.out.printf(f1, "Short: ");
        Short sh1, sh2;
        sh1 = sh2 = 10;
        getHashCodes(sh1, sh2);
        sh2 = 20;
        b = isImMutable(sh1, sh2);
        sh2 = 10;
        isPool(sh1, sh2, b);

        System.out.printf(f1, "Integer: ");
        Integer i1, i2;
        i1 = i2 = 100;
        getHashCodes(i1, i2);
        i2 = 200;
        b = isImMutable(i1, i2);
        i2 = 100;
        isPool(i1, i2, b);

        System.out.printf(f1, "Long: ");
        Long l1, l2;
        l1 = l2 = 100L;
        getHashCodes(l1, l2);
        l2 = 200L;
        b = isImMutable(l1, l2);
        l2 = 100L;
        isPool(l1, l2, b);

        System.out.printf(f1, "Boolean: ");
        Boolean b1, b2;
        b1 = b2 = true;
        getHashCodes(b1, b2);
        b2 = false;
        b = isImMutable(b1, b2);
        b2 = true;
        isPool(b1, b2, b);

        System.out.printf(f1, "Character: ");
        Character c1, c2;
        c1 = c2 = 111;
        getHashCodes(c1, c2);
        c2 = 55;
        b = isImMutable(c1, c2);
        c2 = 111;
        isPool(c1, c2, b);

        System.out.printf(f1, "Double: ");
        Double d1, d2;
        d1 = d2 = 1.1D;
        getHashCodes(d1, d2);
        d2 = 2.2D;
        b = isImMutable(d1, d2);
        d2 = 1.1D;
        isPool(d1, d2, b);

        System.out.printf(f1, "Float: ");
        Float f1, f2;
        f1 = f2 = 1.1F;
        getHashCodes(f1, f2);
        f2 = 2.2F;
        b = isImMutable(f1, f2);
        f2 = 1.1F;
        isPool(f1, f2, b);

        System.out.printf(Main.f1, "BigInteger: ");
        BigInteger bi1, bi2;
        bi1 = bi2 = new BigInteger("2");
        getHashCodes(bi1, bi2);
        bi2 = bi2.add(new BigInteger("3"));
        b = isImMutable(bi1, bi2);
        bi2 = new BigInteger("2");
        isPool(bi1, bi2, b);

        System.out.printf(Main.f1, "BigDecimal: ");
        BigDecimal bd1, bd2;
        bd1 = bd2 = new BigDecimal("1.1");
        getHashCodes(bd1, bd2);
        bd2 = bd2.add(new BigDecimal("1.1"));
        b = isImMutable(bd1, bd2);
        bd2 = new BigDecimal("1.1");
        isPool(bd1, bd2, b);

        System.out.printf(Main.f1, "LocalDate: ");
        LocalDate ld1, ld2;
        ld1 = ld2 = LocalDate.parse("2023-01-12");
        getHashCodes(ld1, ld2);
        ld2 = LocalDate.now();
        b = isImMutable(ld1, ld2);
        ld2 = LocalDate.parse("2023-01-12");
        isPool(ld1, ld2, b);

        System.out.printf(Main.f1, "LocalDateTime: ");
        LocalDateTime ldt1, ldt2;
        ldt1 = ldt2 = LocalDateTime.parse("2023-01-12T10:00");
        getHashCodes(ldt1, ldt2);
        ldt2 = LocalDateTime.now();
        b = isImMutable(ldt1, ldt2);
        ldt2 = LocalDateTime.parse("2023-01-12T10:00");
        isPool(ldt1, ldt2, b);

        System.out.printf(Main.f1, "ZonedDateTime: ");
        ZonedDateTime zdt1, zdt2;
        zdt1 = zdt2 = ZonedDateTime.parse("2023-01-12T10:00+03:00[Europe/Moscow]");
        getHashCodes(zdt1, zdt2);
        zdt2 = ZonedDateTime.now();
        b = isImMutable(zdt1, zdt2);
        zdt2 = ZonedDateTime.parse("2023-01-12T10:00+03:00[Europe/Moscow]");
        isPool(zdt1, zdt2, b);


    }

    private static void getHashCodes(Object o1, Object o2) {
        System.out.printf(f1,"hashCodes = " + o1.hashCode() + " and " + o2.hashCode());
    }

    private static boolean isImMutable(Object o1, Object o2) {

        Boolean b = !(o1 == o2);

        if (b) {
            System.out.printf("Не изменяемый - immutable");
        } else {
            System.out.printf("Изменяемый - mutable");
        }

        return b;
    }

    private static void isPool(Object o1, Object o2, Boolean b) {

        if (b && (o1 == o2)) {
            System.out.print(" - Poll +++ Существует для числовых [-128; 127], для символов [0; 127]");
        } else if (b && (o1 != o2)) {
            System.out.print(" - Poll --- Oтсутствует");
        }
        System.out.println("");
    }

}
