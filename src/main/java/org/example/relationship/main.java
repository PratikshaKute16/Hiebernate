package org.example.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class main
{
    public static void main(String[] args)
    {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();


        //creating question object
        Question question=new Question();
        question.setQuestId(101);
        question.setQuestion("what is java?");

        //creating answer object
        Answer answer= new Answer();
        answer.setAnswerId(301);
        answer.setAnswer("java is a programming language");
           answer.setQuestion(question);

        Answer answer1= new Answer();
        answer1.setAnswerId(302);
        answer1.setAnswer("java is a robust language");
          answer1.setQuestion(question);

        List<Answer> list=new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);


        question.setList(list);
//        //creating question object
//        Question question1=new Question();
//        question1.setQuestId(102);
//        question1.setQuestion("what is collection");

//        //creating answer object
//        Answer answer1= new Answer();
//        answer1.setAnswerId(202);
//        answer1.setAnswer("collection is a interface");
//        question1.setAnswer(answer1);

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(question);
        session.save(answer);
//        session.save(question1);
        session.save(answer1);

        tx.commit();
        factory.close();

    }
}
