package com.company.traffic;

/**
 * Created by admin on 22.02.2016.
 */
public class Driver {
    private Human human;
    private DriverLicense driverLicense;

    public Driver() {
    }

    public Driver(Human human, DriverLicense driverLicense) {
        this.human = human;
        this.driverLicense = driverLicense;
    }


    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return
                 human +
                ", driverLicense." + driverLicense
                ;
    }
}