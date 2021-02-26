package _10_dsa_list.exercises.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int DEFAULT_CAPACITY)  {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        if (contains(o)) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }

        return -1;
    }

     public void clear(){
         for (int i = 0; i < size; i++) {
            elements[i]=null;
             }
         }

     public E remove(int index) {
         for (int i = index; i < size; i++) {
             elements[i]=elements[i+1];
         }
         elements[size]=null;
        return (E)elements;
     }

     public int size(){
        return this.size;
     }

     public E clone (){
        Object[] newElements = null;
        for (int i=0 ; i<size;i++){
            newElements[i] = elements[i];
        }
        return (E)newElements;
     }

     public boolean add(){
         if (size == elements.length) {
             return true;
         }else {
             return false;
         }
     }
     @Override
     public String toString() {
        return "Mylist "
                + "element "
                + Arrays.toString(elements);
     }

}



