package example.T35_Object;

public class ObjectForClone implements Cloneable {

    @Override
    public ObjectForClone clone() {
        try {
            return (ObjectForClone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
