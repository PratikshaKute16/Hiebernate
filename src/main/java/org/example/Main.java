package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {

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

        Courses courses=new Courses();
        courses.setCourse("java");
        courses.setDuration(2);

        //creating object of address
//        Address address=new Address();
//        address.setAddressId(106);
//        address.setStreet("Street1");
//        address.setCity("delhi");
//        address.setOpen(true);
//        address.setAddedDate(new Date());
//        address.setX(121.45);

        //Reading imge
//        FileInputStream inputStream=new FileInputStream("src/main/resources/2.jpg");
//        byte[] bytes=new byte[inputStream.available()];
//        inputStream.read(bytes);
//         address.setImage(bytes);

        Session session= sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(emp);
        session.save(courses);
//        session.save(emp);
//        session.save(address);
        tx.commit();
        session.close();


    }
}