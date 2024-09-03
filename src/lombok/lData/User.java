package lombok.lData;

public class User {
    private int id;
    private String name;
    private final String soname;

    //@Data
    //     @Getter
    //     @Setter
    //     @RequiredArgsConstructor
    //     @ToString
    //     @EqualsAndHashCode.

    //@RequiredArgsConstructor
    public User(String soname) {
        this.soname = soname;
    }

    //@Getter
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSoname() {
        return this.soname;
    }

    //@Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    //@EqualsAndHashCode
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$soname = this.getSoname();
        final Object other$soname = other.getSoname();
        if (this$soname == null ? other$soname != null : !this$soname.equals(other$soname)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $soname = this.getSoname();
        result = result * PRIME + ($soname == null ? 43 : $soname.hashCode());
        return result;
    }

    //@ToString
    public String toString() {
        return "User(id=" + this.getId() + ", name=" + this.getName() + ", soname=" + this.getSoname() + ")";
    }
}
