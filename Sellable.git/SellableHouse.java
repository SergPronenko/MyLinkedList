package com.company;

/**
 * Created by admin on 28.01.2016.
 */
public class SellableHouse extends House implements Sellable {
    private int price;


    public SellableHouse(int area, String address, int price) {
        super(area, address);
        this.price = price;
    }

    @Override
    public String description() {
        return "area is " + getArea();
    }

    @Override
    public String name() {
        return getAddress();
    }

    @Override
    public int price() {
        return price;
    }
}
