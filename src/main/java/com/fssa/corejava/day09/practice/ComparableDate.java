package com.fssa.corejava.day09.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

class Task implements Comparable<Task>{
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	private String name;
	private LocalDate deadline;
	
	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	
	@Override
	public int compareTo(Task task) {
		return this.getDeadline().compareTo(task.deadline);
	}
	
	
}

public class ComparableDate {

	public static void main(String[] args) {
		
		Task task1 = new Task(1, "Say HI", LocalDate.parse("2023-07-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		Task task2 = new Task(2, "Open the door", LocalDate.parse("2022-12-02", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		Task task3 = new Task(3, "Run fast", LocalDate.parse("2023-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		
		ArrayList<Task> arr = new ArrayList<>();
		arr.add(task1);
		arr.add(task2);
		arr.add(task3);
		
		for (Task task : arr) {
			System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
		}
		
		Collections.sort(arr);
		
		System.out.println();
		System.out.println("After sorting by date");
		for (Task task : arr) {
			System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
		}
		

	}

}
