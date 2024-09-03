package lombok.lRequiredArgsConstructor;

public class User {
    private int id;
    private String name;
    private final String soname;

    //@RequiredArgsConstructor
    // Constructor для - final - fields
    public User(String soname) {
        this.soname = soname;
    }
}
