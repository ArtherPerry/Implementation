package demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Car extends IDClass{

    private String model;
    private String make;
    private int year;
    private int millage;
    @ManyToOne
    private CarManufacture carManufacture;

    @ManyToOne
    private InsuranceCompany insuranceCompany;

    @OneToMany(mappedBy = "car")
    private List<Owner> ownerList = new ArrayList<>();

    @OneToMany(mappedBy = "car")
    private List<Driver> driverList = new ArrayList<>();


    public Car() {
    }

    public Car(String model, String make, int year, int millage) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.millage = millage;
    }
}
