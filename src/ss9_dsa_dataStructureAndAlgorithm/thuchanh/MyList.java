package ss9_dsa_dataStructureAndAlgorithm.thuchanh;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 2;
    private Object[] elements;


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        Object[] newElements = new Object[newSize];
        for (int i = 0;i<elements.length;i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public int getElement() {
        return elements.length;
    }

    public Object[] getElements() {
        return elements;
    }

    public E get(int i) {
        if(i>=size || i<0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }else return (E) elements[i];
    }
}
