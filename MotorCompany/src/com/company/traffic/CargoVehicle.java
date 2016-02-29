package com.company.traffic;

/**
 * Created by admin on 22.02.2016.
 */
public class CargoVehicle extends Vehicle {
    public enum Goods {BIGLORRY ,COMMERCIAL}
    private Goods goods;
    private int cc;
    private int hp;
    private int tonnage;

    public CargoVehicle() {
    }

    public CargoVehicle(String model, DriverLicense.Category category, String number, Goods goods, int cc, int hp, int tonnage) {
        super(model, category, number);
        this.goods = goods;
        this.cc = cc;
        this.hp = hp;
        this.tonnage = tonnage;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
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

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return
                "goods=" + goods +
                ", cc=" + cc +
                ", hp=" + hp +
                ", tonnage=" + tonnage
                ;
    }
}
