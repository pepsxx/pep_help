package lombok.lSetter;

public class User {
    private int id;
    private String name;

    //@Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
