package example.T00_CodeTest.t003;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(ints);
        System.out.println("-------------------------");

        var stream = ints.stream().filter(i -> i % 2 == 0).peek(System.out::println);

        List<Integer> newList = stream.toList();
        System.out.println("-------------------------") ;

//        int sum = stream.reduce(0, Integer::sum);

        System.out.println(newList);
        System.out.println("-------------------------");

//        System.out.println(sum);
        System.out.println("-------------------------");


    }
}
