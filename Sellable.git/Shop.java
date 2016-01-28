package com.company;

public class Shop {

    public static void main(String[] args) {

                Sellable [] goods = {new SellablePet("cat" , "Tom" , 100),
                        new SellableHouse(100, "Klovskiy Uzviz" , 1000) ,
                        new Car("Toyota" , 2010 , 10000)};
                     for (Sellable g : goods){
                    System.out.println(g.name()+"|"+g.price()+"|"+g.description());
                }
    }
}


