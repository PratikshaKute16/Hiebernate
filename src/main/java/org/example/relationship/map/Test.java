package org.example.relationship.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();

        Emp1 emp1=new Emp1();
        emp1.setEmpid(101);
        emp1.setName("Ram");

        Emp1 emp2=new Emp1();
        emp2.setEmpid(102);
        emp2.setName("Shyam");

        Project project1=new Project();
        project1.setPid(201);
        project1.setPname("Hibernate Project");

        Project project2=new Project();
        project2.setPid(202);
        project2.setPname("java Project");

        List<Emp1> list1=new ArrayList<Emp1>();
        list1.add(emp1);
        list1.add(emp2);

        List<Project>list2=new ArrayList<Project>();
        list2.add(project1);
        list2.add(project2);

       emp1.setList(list2);
       project2.setList(list1);


        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(emp1);
        session.save(emp2);
        session.save(project1);
        session.save(project2);

        tx.commit();
        session.close();
        factory.close();

    }
}
