package com.fssa.corejava.day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Task {
	
	private int id;
	private String name;
	private LocalDate deadline;
	
	public Task(int id, String name, String date) {
		
		this.id = id;
		this.name = name;
        LocalDate localDate = LocalDate.parse(date);
        this.deadline = localDate;

	}
	
	@Override
	public String toString() {
		return "[Id: " + id + ", Name: " + name + ", Deadline: " + deadline + "]";
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                Objects.equals(name, task.name) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, deadline);
    }
	
	public static void main(String[] args) {
		
		Task task1 = new Task(1, "Say HI", "2023-07-20");
		Task task2 = new Task(1, "Say HI", "2023-07-20");
		
		ArrayList<Task> arr = new ArrayList<Task>();
		arr.add(task1);
		arr.add(task2);
		System.out.println(arr);
		
		HashSet<Task> uniqueArr = new HashSet<Task>(arr);
		System.out.println(uniqueArr);
		
	}
	
}
