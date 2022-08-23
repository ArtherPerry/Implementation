package demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "driver")
public class Driver extends Person{

    private String driverLicense;

    public Driver(String name, LocalDate dateOfBirth, String driverLicense) {
        super(name, dateOfBirth);
        this.driverLicense = driverLicense;
    }

    public Driver() {

    }
    @ManyToOne
    //@JoinTable
    private Car car;
}
