package com.company.traffic;

/**
 * Created by admin on 22.02.2016.
 */
public abstract class Vehicle {
    private  String model;
    private  String number;
    private  DriverLicense.Category category;

    public Vehicle() {
    }

    public Vehicle(String model, DriverLicense.Category category, String number) {
        this.model = model;
        this.category = category;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DriverLicense.Category getCategory() {
        return category;
    }

    public void setCategory(DriverLicense.Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", category=" + category
                ;
    }
}
