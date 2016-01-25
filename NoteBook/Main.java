package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate today = LocalDate.now();
        System.out.println(today);
        Date date = new Date(1977,12,05);
        System.out.println(date);
        NoteBook human1  = new NoteBook(1977,12,05, "Pronenko", "Sergey", "Nicolaevich", "38-050-223-33-68");
        System.out.println(human1);
    }
}
