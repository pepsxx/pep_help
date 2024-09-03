package lombok.lEqualsAndHashCode_Id;

public class User {
    private int id;
    private String name;

    //@EqualsAndHashCode(of = "id")
    // Equals и HashCode для - fields - id
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.id != other.id) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.id;
        return result;
    }
}
