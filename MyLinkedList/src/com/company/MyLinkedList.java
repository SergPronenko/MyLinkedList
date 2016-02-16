package com.company;

import java.util.Iterator;

/**
 * Created by admin on 13.02.2016.
 */
public class MyLinkedList<T> implements Iterable {
    private Node<T>first;
    private Node<T>last;
    private int size = 0;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node curr = first;
            @Override
            public boolean hasNext() {
                return curr !=null;
            }

            @Override
            public T next() {
                Node temp = curr;
                curr = curr.next;
                return (T)temp.value;
            }
        };
    }




    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node() {
        }

        public Node(Object value, T next, Node<T> prev) {
            this.value = (T) value;
            this.next = (Node<T>) next;
            this.prev = prev;
        }


    }


    public void addFirst (T value) {

        if (isEmpty()) {
            Node newNode = new Node();
            newNode.value = value;
            last = newNode;
            first = last;
        } else {
            Node newNode = new Node(value ,first , null );
            first.prev = newNode;
            first = newNode;
        }
        ++size;
    }

    public void addLast (T value) {

        if (isEmpty()) {

            Node newNode = new Node();
            newNode.value = value;
            last  = newNode;
            first = last;
        } else {
            Node previous = last;
            last = new Node();
            last.value = value;
            previous.next = last;
            last.prev = previous;

        }
        size++;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void removeFirst() {
        if( size == 0 ){
            return;
        }else if (size == 1){
            size = 0;
            last = first = null;
            return;
        }
        first = first.next;
        first.prev = null ;
        --size;

    }
    public void removeLast() {
        if( size == 0 ){
            return;
        }else if (size == 1 ){
            size = 0;
            last = first = null;
            return;
        }
        last = last.prev;
        last.next = null;
        size--;
    }

    Node<T> node(int index) {

        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

//    private void checkValumeIndex (int index, int seze){
//        if (index < 0 || index >= size){
//            throw new IndexOutOfBoundsException();
//        }
//    }



    public T get (int idx){

        if (idx > size) {
            throw new ArrayIndexOutOfBoundsException("Out of index");
        }

        Node temp = first;


        for (int i = 0 ; i < idx; i++) {
            temp = temp.next;
        }
        return (T)temp.value;
    }


    public void set(T item, int idx) {
        if (idx > size) {
            throw new ArrayIndexOutOfBoundsException("Out of index");
        }
        Node temp = first;

        for (int i = 0 ; i < idx; i++) {
            temp = temp.next;
        }
        temp.value = item;
    }




}
