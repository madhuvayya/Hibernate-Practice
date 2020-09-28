package com.bridgelabz.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Name name = new Name();
    	name.setFirstName("Madhu");
    	name.setLastName("V");
    	
        Lecturer lecturer = new Lecturer();

        lecturer.setId(4);
        lecturer.setName(name);
        lecturer.setSubject("Physics");
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Lecturer.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        // save method is used to store the data into database 
         session.save(lecturer);
        
//        lecturer = session.get(Lecturer.class, 10);

        transaction.commit();
        
        System.out.println(lecturer);
    }
}
