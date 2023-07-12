package com.fssa.corejava.day03.practice;

public class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }  
    
    @Override
    public String toString() {
    	return ("id=" + id + ", " + "name=" + name);
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        
    }
}
