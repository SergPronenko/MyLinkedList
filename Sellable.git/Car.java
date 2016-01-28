package com.company;

/**
 * Created by admin on 28.01.2016.
 */
public class Car implements Sellable {
    private String model;
    private int year;
    private int price;

    public Car(String model, int price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public String description() {
        return  "manufactured in " + year;
    }

    @Override
    public String name() {
        return model;
    }

    @Override
    public int price() {
        return price;
    }
}
