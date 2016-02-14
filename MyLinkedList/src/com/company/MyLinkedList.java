package com.company;

/**
 * Created by admin on 13.02.2016.
 */
public class MyLinkedList<T>  {
    transient Node<T>first;
    transient Node<T>last;
    transient int size = 0;


    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(Object value, T next, Node<T> prev) {
            this.value = (T) value;
            this.next = (Node<T>) next;
            this.prev = prev;
        }
    }


    public void addFirst(T t){
        final Node<T> f = first;
        final Node<T> newNode = new Node<>(null,t,f);
        first = newNode;
        if (f==null){
            last = newNode;
        }else {
            f.prev =newNode;
        }
        size++;
    }

    public void addLast(T t){
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l,t,null);
        last = newNode;
        if (l==null){
            first = newNode;
        }else {
            l.next =newNode;
        }
        size++;
    }

    private void removeRirst(Node<T> f){
        final T value =f.value;
        final Node<T> next = f.next;
        f.value = null;
        f.next = null;
        first = next;
        if (next == null){
            last = null;
        }else {
            next.prev = null;
        }
        size--;
    }
    private void  removeLast(Node<T> l){
        final T value = l.value;
        final Node<T>prev = l.prev;
        l.value = null;
        l.prev = null;
        last = prev;
        if (prev == null){
            first = null;
        }else {
            prev.next = null;
        }
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

    private void checkValumeIndex (int index, int seze){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    public T get (int index){
        checkValumeIndex(index,size);
        return node(index).value;
    }

}
