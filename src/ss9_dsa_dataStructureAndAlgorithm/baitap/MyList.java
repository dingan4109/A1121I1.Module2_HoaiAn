package ss9_dsa_dataStructureAndAlgorithm.baitap;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    //PENDING
    public void add(int index, E element) {
        int length = elements.length;
        if (index < 0 || index > length - 1) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + length);
        } else {
                if (elements[index] == null) {
                    elements[index] = element;
                } else {
                    int newLength = length + 1;
                    Object[] newElements = new Object[newLength];
                    int j = 0;
                    for (int i = 0; i < length; i++) {
                        if (i == index) {
                            newElements[i] = element;
                            j++;
                        }
                        newElements[j++] = elements[i];
                    }
                    elements = newElements;
                    size++;
                }
                }
            }

    public E remove(int index) {
        if(index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index error: " + index);
        }else {
            E element = (E) elements[index];
            Object[] newElements = new Object[elements.length-1];
            int j = 0;
            for(int i = 0; i<elements.length;i++) {
                if(i == index) {
                    continue;
                }
                newElements[j++] = elements[i];
            }
            elements = newElements;
            size--;
            return element;
        }
    }

    public E clone() {
        MyList<E> cloneList = new MyList<>();
        cloneList.elements = Arrays.copyOf(elements,size);
        cloneList.size = size;

        return (E)cloneList;
    }

    public boolean contains(E o) {
            int check = indexOf(o);
            if(check!= -1){
                return true;
            }else return false;
    }

    public int indexOf(E o) {
        int index = -1;
        for(int i = 0; i<elements.length;i++) {
            if(o.equals(elements[i])) {
                index =  i;}
        } return index;
    }

    public boolean add(E e) {
        if(getSize() == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;

        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newCapacity = elements.length + minCapacity;
        elements = Arrays.copyOf(elements,newCapacity);
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
    for(int i = 0; i<elements.length;i++) {
       elements[i] = null;
    }
    size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getLength(){
        return elements.length;
    }

}
