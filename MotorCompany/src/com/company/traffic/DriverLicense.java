package com.company.traffic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 22.02.2016.
 */
public class DriverLicense {

    public enum Category {A,B,C,D,E}
    private List<Category> categories = new ArrayList<Category>();
    private Date experienceVehicleFromDate;

    public DriverLicense() {
    }

    public DriverLicense(List<Category> categories, Date experienceVehicleFromDate) {
        this.categories = categories;
        this.experienceVehicleFromDate = experienceVehicleFromDate;
    }

    public DriverLicense(Category category, Date experienceVehicleFromDate) {
        this.categories.add(category);
        this.experienceVehicleFromDate = experienceVehicleFromDate;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Date getExperienceVehicleFromDate() {
        return experienceVehicleFromDate;
    }

    public void setExperienceVehicleFromDate(Date experienceVehicleFromDate) {
        this.experienceVehicleFromDate = experienceVehicleFromDate;
    }

    @Override
    public String toString() {
        return
                "categories " + categories +
                ", experienceVehicleFromDate=" + experienceVehicleFromDate
                ;
    }
}
