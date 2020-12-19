package com.learn.java.nivas;

public class Main {
	
	public static void findGpa() {
		System.out.println("static block Main");
	}
	
	public  void findGpa1() {
		System.out.println("Non-static block Main");
	}
	
	public static void main(String[] args) {
		StudentProfile studentA = new StudentProfile("Nivas","Ganesan",2019,7.54);
		StudentProfile studentB = new StudentProfile("Bhuvi","K",2019,9.54);
		
		System.out.println(studentA.findexpectedYear());
		StudentProfile.findGpa();
		findGpa();
		Main m = new Main();
		m.findGpa1();
	}

}
