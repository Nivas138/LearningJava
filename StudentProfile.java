package com.learn.java.nivas;

public class StudentProfile {
	
	String firstName;
	
	String lastName;
	
	int expectedYearOfGraduation;
	
	double GPA;
	
	static int gpas = 7;
	
	public StudentProfile(String fname,String lname,int expectedYearOfGraduation,double graduationPoint) {
		this.firstName = fname;
		this.lastName = lname;
		this.expectedYearOfGraduation = expectedYearOfGraduation;
		this.GPA = graduationPoint;
	}
	
	public int findexpectedYear() {
		return this.expectedYearOfGraduation +=1;
	}
	
	public static void findGpa() {
		System.out.println("static block");
	}
}
