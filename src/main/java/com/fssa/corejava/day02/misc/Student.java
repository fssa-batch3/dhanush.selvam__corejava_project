package com.fssa.corejava.day02.misc;

public class Student {
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String email;
	int id;
	
	public static String academy;
	static int count = 0;
	
	public Student() {
		Student.count ++;
	}
	
	// static initialization block
	static {
		academy = "FSSA";
	}

}
