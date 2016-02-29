package com.company.traffic;

import java.util.Date;

/**
 * Created by admin on 22.02.2016.
 */
public class Human {
    private String name;
    private Date insuranceExpires;

    public Human() {
    }

    public Human(String name, Date insuranceExpires) {
        this.name = name;
        this.insuranceExpires = insuranceExpires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInsuranceExpires() {
        return insuranceExpires;
    }

    public void setInsuranceExpires(Date insuranceExpires) {
        this.insuranceExpires = insuranceExpires;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", insuranceExpires=" + insuranceExpires
                ;
    }
}
