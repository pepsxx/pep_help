package lombok.lEqualsAndHashCode;

public class User {
    private int id;
    private String name;

    //@EqualsAndHashCode
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.id != other.id) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.id;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }
}
