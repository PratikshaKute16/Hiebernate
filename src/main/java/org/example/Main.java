package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello world!");
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        System.out.println(sessionFactory);

//        creating emp object

        Emp emp=new Emp();
        emp.setId(11);
        emp.setName("Rudra");
        emp.setCity("Pune");
        System.out.println(emp);

        Session session= sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(emp);
        tx.commit();
        session.close();


    }
}