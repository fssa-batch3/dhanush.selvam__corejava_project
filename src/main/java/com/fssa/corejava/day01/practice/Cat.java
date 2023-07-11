package com.fssa.corejava.day01.practice;

public class Cat {
	// Attributes
	int age;
	String color;

	// Getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void speaks() {
		System.out.println("Meow!");
	}

	// Main method to create Dog objects
	public static void main(String[] args) {
		// Create two Dog objects
		Cat cat1 = new Cat();
		cat1.setColor("White");
		cat1.setAge(4);
		Cat cat2 = new Cat();
		cat2.setColor("Black");
		cat2.setAge(3);

		// Print the attributes of each Dog
		System.out.println("Cat 1:");
		System.out.println("Age: " + cat1.getAge());
		System.out.println("Color: " + cat1.getColor());
		System.out.print("Speaks: ");
		cat1.speaks();

		System.out.println("Cat 2:");
		System.out.println("Age: " + cat2.getAge());
		System.out.println("Color: " + cat2.getColor());
		System.out.print("Speaks: ");
		cat1.speaks();

	}
}
