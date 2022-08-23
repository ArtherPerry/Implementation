package demo;


import demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
    private static SessionFactory sessionFactory;

    static {
        sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Car.class,CarManufacture.class,InsuranceCompany.class,Company.class,Person.class,Owner.class,Driver.class));
    }

    public static void main(String[] args) {
        try (Session session = sessionFactory.openSession()) {
            CarDao obj = new CarDao(session);
            obj.createDB();

        }

        JPAUtil.checkData("select * from car");
        JPAUtil.checkData("select * from car_manufacture");
        JPAUtil.checkData("select * from insurance_company");
        JPAUtil.checkData("select * from owner");
        JPAUtil.checkData("select * from driver");
        JPAUtil.checkData("select * from person");
        JPAUtil.checkData("select * from company");




    }
}