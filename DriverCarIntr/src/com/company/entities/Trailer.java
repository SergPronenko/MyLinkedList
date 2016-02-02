package com.company.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 02.02.2016.
 */
public class Trailer {
    private String number;
    private String vin;
    public enum Category {C,D,E}
    private Category category;

    public Trailer() {
    }

    public Trailer(String number, String vin, Category category) {
        this.number = number;
        this.vin = vin;
        this.category = category;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "number='" + number + '\'' +
                ", vin='" + vin + '\'' +
                ", category=" + category +
                '}';
    }
}
