package Example.T25;

import java.util.List;

public class User {
    List<Group> groups;
    String name;

    public String getName() {
        return name;
    }

    public User(List<Group> groups, String name) {
        this.groups = groups;
        this.name = name;
    }
}
