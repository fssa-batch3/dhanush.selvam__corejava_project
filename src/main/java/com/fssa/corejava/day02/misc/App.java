package com.fssa.corejava.day02.misc;

public class App {

	public static void main(String[] args) {

		Academy a1 = new Academy();
		a1.setName("Freshworks Software Academy");
		a1.setId(1);
		a1.setCode("FSSA");
		
		Student s1 = new Student();
		s1.setName("Dhanush");
		s1.setEmail("dhanush@gmail.com");
		s1.setId(1);
		System.out.println(Student.academy);
		System.out.println(Student.count);
		
		Student s2 = new Student();
		s2.setName("Surya");
		s2.setEmail("surya@gmail.com");
		s2.setId(2);
		System.out.println(Student.academy);
		System.out.println(Student.count);
		
	}

}
