package example.T09_Generics;

public class ListGeneric<T> {
    int size;
    T[] t;

    public ListGeneric(int size) {
        this.t = (T[]) new Object[size];
    }
    void add (T t){
        this.t[this.size++] = t;
    }

    T get (int index){
        return this.t[index];
    }
}
