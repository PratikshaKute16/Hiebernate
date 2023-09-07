package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ConcurrentModificationException;

public class FetchData
{
    public static void main(String[]  args) {
        Configuration  cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory =cfg.buildSessionFactory();

        Session  session=factory.openSession();
        Address  address=(Address)session.get(Address.class,1);

       Emp emp=(Emp)session.load(Emp.class,11);
        System.out.println(emp);
     session.close();
     factory.close();
    }
}
