package Example.T11_Iterator;

import java.util.Iterator;

public class ListGeneric<T> implements Iterable<T> { // implements Iterable<T>
    int size;
    T[] t;

    public ListGeneric(int size) {
        this.t = (T[]) new Object[size];
    }

    void add(T t) {
        this.t[this.size++] = t;
    }

    T get(int index) {
        return this.t[index];
    }

    // NEW Code

    @Override
    public Iterator<T> iterator() {
        return new MyIteratorForListGeneric();
    }

    private class MyIteratorForListGeneric implements Iterator<T> {

        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            return t[cursor++];
        }
    }
}
