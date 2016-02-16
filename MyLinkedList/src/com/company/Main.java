package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      //  MyLinkedList<String> list =  new MyLinkedList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(1);
        list.addLast(5);
        list.addFirst(10);
        list.addFirst(2);
        list.addLast(8);
        list.addFirst(19);

        for (Object i : list) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("======================");
        list.removeFirst();
        list.removeLast();

        for (Object i : list) {
            System.out.print(i + ", ");
        }

    }
}
