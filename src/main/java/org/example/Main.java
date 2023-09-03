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

        //creating student object
        Student12 student=new Student12();
        student.setId(101);
        student.setName("Pratiksha");
        student.setCity("Pune");
        System.out.println(student);


        Session session= sessionFactory.getCurrentSession();

        Transaction tx=session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();


    }
}