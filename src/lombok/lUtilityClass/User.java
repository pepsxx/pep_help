package lombok.lUtilityClass;

public final class User {
    // Добавляется - static
    private static final int id = 25;
    private static final String name = "Dino";
    private static final String soname = "Joy";

    // Добавляется - static
    public static User get() {
        return new User();
    }

    //@UtilityClass
    private User() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
