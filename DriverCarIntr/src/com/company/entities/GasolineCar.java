package com.company.entities;

/**
 * Created by Администратор on 25.01.2016.
 */
public class GasolineCar extends Vehicle {
    private int cc;
    private int hp;
    public enum Transmission {MECHANICAL, AUTOMATIC};
    private Transmission transmission;
    private Trailer trailer;


    public GasolineCar() {
    }

    public GasolineCar(String model, String number, String vin, DriverLicense.Category category, int cc, int hp,
                       Transmission transmission, Trailer trailer) {
        super(model, number, vin, category);

        this.cc = cc;
        this.hp = hp;
        this.transmission = transmission;
        this.trailer = trailer;
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

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
}
