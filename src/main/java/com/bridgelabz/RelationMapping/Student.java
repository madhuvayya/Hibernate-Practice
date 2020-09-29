package com.bridgelabz.RelationMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@Column(name="roll_number")
	private int rollNumber;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="percentage")
	private double percentage;
	
//	@OneToOne
//	private Laptop laptop;
	
	@OneToMany
	private List<Laptop> laptops = new ArrayList<Laptop>();

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + studentName + ", percentage=" + percentage + "]";
	}
}
