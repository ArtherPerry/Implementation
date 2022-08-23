package demo.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.List;

public class CarDao {

    private Session session;

    public CarDao(Session session) {
        this.session = session;
    }

    public void createDB() {

            Car car1 = new Car("Mark II","Toyota",2003,1000);
            Car car2 = new Car("Civic","Honda",2009,500);
            Car car3 = new Car("X5","BMW",2001,1500);

            Owner owner1 = new Owner("John Doe", LocalDate.of(2000,12,1),1);
            Owner owner2 = new Owner("John William", LocalDate.of(1999,1,12),2);
            Owner owner3 = new Owner("Thomas Hardy", LocalDate.of(1998,11,12),3);

            Driver driver1 = new Driver("Richard Chan",LocalDate.of(2001,3,5),"Red");
            Driver driver2 = new Driver("Robert Frost",LocalDate.of(2000,5,5),"Black");

            CarManufacture carManufacture1 = new CarManufacture("Toyota","Japan",100,1937);
            CarManufacture carManufacture2 = new CarManufacture("Honda","Japan",90,1948);
            CarManufacture carManufacture3 = new CarManufacture("BMW","Germany",110,1916);

            InsuranceCompany insuranceCompany1 = new InsuranceCompany("State Farm","USA",892);
            InsuranceCompany insuranceCompany2 = new InsuranceCompany("Geico","USA",881);

            car1.setCarManufacture(carManufacture1);
            car2.setCarManufacture(carManufacture2);
            car3.setCarManufacture(carManufacture3);
            car1.setInsuranceCompany(insuranceCompany1);
            car2.setInsuranceCompany(insuranceCompany2);
            carManufacture1.getCarList().add(car1);
            carManufacture2.getCarList().add(car2);
            carManufacture3.getCarList().add(car3);
            insuranceCompany1.getCarList().add(car1);
            insuranceCompany2.getCarList().add(car2);

            owner1.setCar(car1);
            owner2.setCar(car2);
            owner2.setCar(car3);
            driver1.setCar(car1);
            driver2.setCar(car2);
            car1.getOwnerList().add(owner1);
            car2.getOwnerList().add(owner2);
            car3.getOwnerList().add(owner3);
            car1.getDriverList().add(driver1);
            car2.getDriverList().add(driver2);





        Transaction tx = session.beginTransaction();
            session.persist(car1);
            session.persist(car2);
            session.persist(car3);
            session.persist(carManufacture1);
            session.persist(carManufacture2);
            session.persist(carManufacture3);
            session.persist(owner1);
            session.persist(owner2);
            session.persist(owner3);
            session.persist(driver1);
            session.persist(driver2);
            session.persist(insuranceCompany1);
            session.persist(insuranceCompany2);

        tx.commit();
    }
}
