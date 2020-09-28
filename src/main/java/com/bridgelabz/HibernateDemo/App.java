package com.bridgelabz.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Lecturer lecturer = new Lecturer();
        lecturer.setId(4);
        lecturer.setName("Dhanraj");
        lecturer.setSubject("Physics");
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Lecturer.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        session.save(lecturer);
        transaction.commit();
    }
}