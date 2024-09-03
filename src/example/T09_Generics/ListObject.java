package example.T09_Generics;

public class ListObject {
    int size;
    Object[] object;

    public ListObject(int size) {
        this.object = new Object[size];
    }
    void add (Object object){
        this.object[this.size++] = object;
    }

    Object get (int index){
        return this.object[index];
    }
}
