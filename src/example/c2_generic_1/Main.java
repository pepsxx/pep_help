package example.c2_generic_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------------------");

        ListObject listObject = new ListObject(10);
        listObject.add("Str1");
        listObject.add(0);
        listObject.add("Str3");
        System.out.println("listObject.get(0).toString() = " + listObject.get(0).toString());
        System.out.println("listObject.get(2).toString() = " + listObject.get(1).toString());
        System.out.println("listObject.get(1).toString() = " + listObject.get(2).toString());
        String stringA = (String) listObject.get(0);
//        String stringB = (String) listObject.get(1); // Будет ошибка при явном приведении.
        String stringC = (String) listObject.get(2);
        System.out.println("------------------------------------------------------------------------------------------");

        ListGeneric<String> listString = new ListGeneric<>(10);
        listString.add("Str1");
        listString.add("Str2"); // Не даст сделать ошибку listString.add(0);
        listString.add("Str3");
        System.out.println("listString.get(0) = " + listString.get(0));
        System.out.println("listString.get(1) = " + listString.get(1));
        System.out.println("listString.get(2) = " + listString.get(2));
        String string0 = listString.get(0);
        String string1 = listString.get(1); // Будет ошибка при явном приведении.
        String string2 = listString.get(2);
        System.out.println("------------------------------------------------------------------------------------------");

        ListGeneric<Integer> listInteger = new ListGeneric<>(10);
        listInteger.add(0); // Не даст сделать ошибку listInteger.add("Str0");
        listInteger.add(1);
        listInteger.add(2); // Не даст сделать ошибку listInteger.add("Str2");
        System.out.println("listInteger.get(0) = " + listInteger.get(0));
        System.out.println("listInteger.get(1) = " + listInteger.get(1));
        System.out.println("listInteger.get(2) = " + listInteger.get(2));
        Integer integer0 = listInteger.get(0);
        Integer integer1 = listInteger.get(1); // Будет ошибка при явном приведении.
        Integer integer2 = listInteger.get(2);
        System.out.println("------------------------------------------------------------------------------------------");

    }
}
