package demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "insurance_company")
public class InsuranceCompany extends Company{
    private int rating;

    public InsuranceCompany(String name, String address, int rating) {
        super(name, address);
        this.rating = rating;
    }

    public InsuranceCompany() {

    }
    @OneToMany
    //@JoinTable
    private List<Car> carList = new ArrayList<>();
}
