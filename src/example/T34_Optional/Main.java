package example.T34_Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("list = " + list);

        Optional<List<String>> optionalList = Optional.of(list);
        System.out.println("optionalList                              = " + optionalList);
        System.out.println("optionalList.get()                        = " + optionalList.get());
        String s = optionalList.toString();

        for (int i = 0; i < 2; i++) {
            System.out.println("---------- " + s + " ----------");
            System.out.println();

            System.out.println("isPresent:       optionalList.isPresent()");
            System.out.println("result:          " + optionalList.isPresent());
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("isEmpty:         optionalList.isEmpty()");
            System.out.println("result:          " + optionalList.isEmpty());
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("map:             optionalList.map(l -> l.add(\"D\"))");
            System.out.println("result:          " + optionalList.map(l -> l.add("D")));
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("filter:          optionalList.filter(l -> l.contains(\"D\"))");
            System.out.println("result:          " + optionalList.filter(l -> l.contains("D")));
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("filter:          optionalList.filter(l -> l.contains(\"X\"))");
            System.out.println("result:          " + optionalList.filter(l -> l.contains("X")));
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("ifPresent:       optionalList.ifPresent(vl -> System.out.print(\"Ok: \" + vl))");
            System.out.print("resultAction:    ");
            optionalList.ifPresent(vl -> System.out.print("Ok: " + vl));
            System.out.println();
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("""
                    ifPresentOrElse: optionalList.ifPresentOrElse(
                                     vl -> System.out.print("Ok: " + vl),
                                     () -> System.out.print("Bad"))""");
            System.out.print("resultAction:    ");
            optionalList.ifPresentOrElse(
                    vl -> System.out.print("Ok: " + vl),
                    () -> System.out.print("Bad"));
            System.out.println();
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("orElse:          optionalList.orElse(List.of(\"X\", \"Y\"))");
            System.out.println("result:          " + optionalList.orElse(List.of("X", "Y")));
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("orElseGet:       optionalList.orElseGet(() -> List.of(\"X\", \"Y\"))");
            System.out.println("result:          " + optionalList.orElseGet(() -> List.of("X", "Y")));
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("or:              optionalList.or(() -> Optional.of(List.of(\"X\", \"Y\")))");
            System.out.println("result:          " + optionalList.or(() -> Optional.of(List.of("X", "Y"))));
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            System.out.println("orElseThrow:     optionalList.orElseThrow(() -> new RuntimeException(\"Bad\"))");
            System.out.println("result:          " + optionalList.orElseThrow(() -> new RuntimeException("Bad")));
            System.out.println("optionalList:    " + optionalList);
            System.out.println();

            optionalList = Optional.empty();
            s = optionalList.toString();
        }

    }
}
