package example.T15_Streams.v001;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ls = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

        System.out.println("ls = " + ls);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        for (String s : ls) {
            s = s + s;
            Integer i = Integer.valueOf(s);
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ls.stream()
                .map(s -> s + s)
                .map(s -> Integer.valueOf(s))
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println("i = " + i));
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ls.stream()
                .map(s -> s + s)
                .map(Integer::valueOf)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
