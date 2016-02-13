package com.company;

//import java.util.ArrayList;

import java.util.Iterator;

/**
 * Created by admin on 09.02.2016.
 */
public class MyArrayList <T> implements  Iterable<T> {
    private T arr[];
    private  int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {
        arr =(T[]) new Object[DEFAULT_CAPACITY];

    }
    public  MyArrayList (int capacity){
        arr =(T[]) new  Object[]{capacity};
    }




    private void growArray() {
       T[] newArray =(T[]) new Object[arr.length * 3/2+1];
        System.arraycopy(arr, 0, newArray, 0, size );
        arr =  newArray;
    }


    public void add(T  value){
        if (size == arr.length) {
            growArray();
        }
        arr[size] = value;
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
    }

    public void set(int index, T value) {
        checkIndex(index);
        arr[index] = value;
    }

    public int size() {
        return size;
    }


    public boolean remove(int index) {
        checkIndex(index);
        System.arraycopy(arr, index + 1, arr, index, this.size - index);
        size--;
        return true;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index <size;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }


}
