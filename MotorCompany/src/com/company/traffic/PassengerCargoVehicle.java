package com.company.traffic;

/**
 * Created by admin on 22.02.2016.
 */
public class PassengerCargoVehicle extends Vehicle {
    private int cc;
    private int hp;
    private int quantityPassenger;
    private  double quanntityTonnage;

    public PassengerCargoVehicle() {
    }

    public PassengerCargoVehicle(String model, DriverLicense.Category category, String number, int cc, int hp, int quantityPassenger, double quanntityTonnage) {
        super(model, category, number);
        this.cc = cc;
        this.hp = hp;
        this.quantityPassenger = quantityPassenger;
        this.quanntityTonnage = quanntityTonnage;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getQuantityPassenger() {
        return quantityPassenger;
    }

    public void setQuantityPassenger(int quantityPassenger) {
        this.quantityPassenger = quantityPassenger;
    }

    public double getQuanntityTonnage() {
        return quanntityTonnage;
    }

    public void setQuanntityTonnage(int quanntityTonnage) {
        this.quanntityTonnage = quanntityTonnage;
    }

    @Override
    public String toString() {
        return
                "cc=" + cc +
                ", hp=" + hp +
                ", quantityPassenger=" + quantityPassenger +
                ", quanntityTonnage=" + quanntityTonnage
                ;
    }
}
