package DSA.bai_tap;

import java.util.Arrays;

public class ArrayList<E> {
    private int size=1;
    private static final int DEFAULT_CAPACITY=10;
    private Object[] elements;
    private E[] data = (E[]) new Object[DEFAULT_CAPACITY];
    public ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void Capacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            Capacity();
        }
        elements[size++] = e;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }
    public E remove(int index){
        checkIndex(index);
        E e = data[index];
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];
            data[size - 1] = null;
            size--;
            return e;
    }
    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

}
