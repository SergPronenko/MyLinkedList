package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

      MyArrayList<String>arrStr =new MyArrayList<>();
       MyArrayList<Integer> arr = new MyArrayList<>();
       //MyArrayList arr =new MyArrayList();
       arr.add(5);
       arr.add(7);
       arr.add(3);
       arr.add(15);
       arr.add(9);
       arr.add(1);
       arr.add(26);

        //System.out.print(arr.get(2));
        for (int i= 0; i<arr.size(); i++){
            System.out.print(arr.get(i) + ", ");
        }
        System.out.println();
        for (Integer i : arr){
            System.out.print(i + ", ");
        }

    }

}
