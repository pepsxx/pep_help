package lombok.lToString;

public class User {
    private int id;
    private String name;

    //@ToString
    public String toString() {
        return "User(id=" + this.id + ", name=" + this.name + ")";
    }
}
