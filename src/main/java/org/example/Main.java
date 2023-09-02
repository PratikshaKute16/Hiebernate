package org.example;

import com.mysql.cj.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Hello world!");
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

    }
}