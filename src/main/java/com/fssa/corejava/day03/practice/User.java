package com.fssa.corejava.day03.practice;

public class User {
	
	private String name;
	private String email;
	private String password;
	
	public User() {
		
	}
	
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return ("Name: " + name + "\nEmail: " + email + "\nPassword: " + password);
	}
	
	public static void main(String[] args) {
		
		User user1 = new User("Dhanush","dhanush@gmail.com","Aa!12345");
		System.out.println(user1.toString());
		
	}

}
