package lombok.lBuilder;

public class User {
    private int id;
    private String name;
    private final String soname;

    //@Builder
    User(int id, String name, String soname) {
        this.id = id;
        this.name = name;
        this.soname = soname;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private int id;
        private String name;
        private String soname;

        UserBuilder() {
        }

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder soname(String soname) {
            this.soname = soname;
            return this;
        }

        public User build() {
            return new User(this.id, this.name, this.soname);
        }

        public String toString() {
            return "User.UserBuilder(id=" + this.id + ", name=" + this.name + ", soname=" + this.soname + ")";
        }
    }
}