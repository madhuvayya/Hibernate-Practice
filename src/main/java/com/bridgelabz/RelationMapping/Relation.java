package com.bridgelabz.RelationMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Relation {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setId(101);
		laptop.setLaptopName("Dell");
		
		Student student = new Student();
		student.setRollNumber(1);
		student.setStudentName("Madhu");
		student.setPercentage(80.0);
//		student.setLaptop(laptop);
		student.getLaptops().add(laptop);
		
		laptop.getStudents().add(student);
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(laptop);
		session.save(student);
		session.getTransaction().commit();
	}

}
