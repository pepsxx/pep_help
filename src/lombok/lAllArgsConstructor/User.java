package lombok.lAllArgsConstructor;

public class User {
    private int id;
    private String name;
    private final String soname;

    //@AllArgsConstructor
    //  Constructor для - All - fields
    public User(int id, String name, String soname) {
        this.id = id;
        this.name = name;
        this.soname = soname;
    }
}
