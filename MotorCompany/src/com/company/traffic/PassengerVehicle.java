package com.company.traffic;

/**
 * Created by admin on 22.02.2016.
 */
public class PassengerVehicle extends Vehicle {
    public enum Passenger {BUS , MINIBUS}
    private Passenger passenger;

    public PassengerVehicle() {
    }

    public PassengerVehicle(String model, DriverLicense.Category category, String number, Passenger passenger) {
        super(model, category, number);
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return
                "passenger=" + passenger
                ;
    }
}
