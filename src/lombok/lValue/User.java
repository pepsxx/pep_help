package lombok.lValue;

public final class User {
    //@FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
    private final int id;
    private final String name;
    private final String soname;

    //@Value
    // fields - final и private
    //      @Getter
    //      @FieldDefaults(makeFinal=true, level=AccessLevel. PRIVATE)
    //      @AllArgsConstructor
    //      @ToString
    //      @EqualsAndHashCode

    //@AllArgsConstructor
    public User(int id, String name, String soname) {
        this.id = id;
        this.name = name;
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

    //@EqualsAndHashCode
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$soname = this.getSoname();
        final Object other$soname = other.getSoname();
        if (this$soname == null ? other$soname != null : !this$soname.equals(other$soname)) return false;
        return true;
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
