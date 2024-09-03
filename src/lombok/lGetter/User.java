package lombok.lGetter;

public class User {
    private int id;
    private String name;

    //@Getter
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
