package demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "car_manufacture")
public class CarManufacture extends Company{

    private int numberOfEmployee;
    private int yearEstablished;
    @OneToMany(mappedBy = "carManufacture")
    private List<Car> carList = new ArrayList<>();


    public CarManufacture(String name, String address, int numberOfEmployee, int yearEstablished) {
        super(name, address);
        this.numberOfEmployee = numberOfEmployee;
        this.yearEstablished = yearEstablished;
    }
    public CarManufacture(){

    }
}
