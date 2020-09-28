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
        //Commented code for accessing the data from database 
//        lecturer.setId(4);
//        lecturer.setName("Dhanraj");
//        lecturer.setSubject("Physics");
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Lecturer.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        // save method is used to store the data into database 
        // session.save(lecturer);
        
        lecturer = session.get(Lecturer.class, 10);

        transaction.commit();
        
        System.out.println(lecturer);
    }
}
