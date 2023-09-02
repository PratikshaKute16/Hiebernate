package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello world!");
        Configuration configuration=new Configuration();
        configuration.configure("/src/main/resources/hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        System.out.println(sessionFactory);

    }
}