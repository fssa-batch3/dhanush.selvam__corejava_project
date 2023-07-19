package com.fssa.corejava.day05.practice;

class Department {

	String deptName;
	int deptId;

	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

}

class Student {

	String name;
	int id;
	Department department;

	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return ("Student Details: \nName: " + name + "\nId: " + id + "\nDepartment Name: " + department.deptName + "\nDepartment Id: " + department.deptId);
	}
}

public class Main {

	public static void main(String[] args) {
		
		Department dept1 = new Department ("CSE",1);
		Student s1 = new Student("Dhanush",001,dept1);
		System.out.println(s1.toString());

	}

}
