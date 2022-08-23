package demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "owner")
public class Owner extends Person{

    private int ownerNumber;

    public Owner(String name, LocalDate dateOfBirth, int ownerNumber) {
        super(name, dateOfBirth);
        this.ownerNumber = ownerNumber;
    }
    public Owner (){

    }
    @ManyToOne
    //@JoinTable
    private Car car;
}
