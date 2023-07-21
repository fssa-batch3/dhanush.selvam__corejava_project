package com.fssa.corejava.day09.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Task1 {
	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;

	public Task1(int id, String name, LocalDate deadline, int priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public int getPriority() {
		return priority;
	}

}

class PriorityComparator implements Comparator<Task1> {
	public int compare(Task1 t1, Task1 t2) {
		int deadlineComparison = t1.getDeadline().compareTo(t2.getDeadline());
		if (deadlineComparison != 0) {
			return deadlineComparison;
		} else {
			if (t1.getPriority() == t2.getPriority())
				return 0;
			else if (t1.getPriority() > t2.getPriority())
				return 1;
			else
				return -1;
		}
	}
}

public class SortingByPriority {
	public static void main(String[] args) {
		ArrayList<Task1> arr = new ArrayList<>();

		Task1 modelTask1 = new Task1(1, "Say HI", LocalDate.parse("2023-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")),3);
		Task1 modelTask2 = new Task1(2, "Open the door",LocalDate.parse("2023-07-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 1);
		Task1 modelTask3 = new Task1(3, "Run fast",LocalDate.parse("2022-12-02", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 2);
		Task1 modelTask4 = new Task1(4, "Eat too much",LocalDate.parse("2023-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")), 1);

		arr.add(modelTask1);
		arr.add(modelTask2);
		arr.add(modelTask3);
		arr.add(modelTask4);
		
		for (Task1 task : arr) {
			System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline() + "," + task.getPriority());
		}

		Collections.sort(arr, new PriorityComparator());

		System.out.println();
		System.out.println("After Sorting");
		for (Task1 task : arr) {
			System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline() + "," + task.getPriority());
		}
	}
}
