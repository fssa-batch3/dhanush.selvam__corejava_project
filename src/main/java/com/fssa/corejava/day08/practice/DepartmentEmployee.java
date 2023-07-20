package com.fssa.corejava.day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentEmployee {

	public static void main(String[] args) {

		HashMap<String, List<String>> deptEmployeeMap = new HashMap<>();

		addToDepartment(deptEmployeeMap, "HR", "Ram");
		addToDepartment(deptEmployeeMap, "HR", "Suresh");
		addToDepartment(deptEmployeeMap, "IT", "Basker");
		addToDepartment(deptEmployeeMap, "IT", "Joseph");
		addToDepartment(deptEmployeeMap, "Admin", "Sundar");

		// Print the output
		for (Map.Entry<String, List<String>> entry : deptEmployeeMap.entrySet()) {
			String deptName = entry.getKey();
			List<String> employees = entry.getValue();
			System.out.println(deptName + ": " + String.join(", ", employees));
		}
	}

	private static void addToDepartment(Map<String, List<String>> deptEmployeeMap, String deptName,
			String employeeName) {
		// If the department already exists in the map, add the employee to its list
		if (deptEmployeeMap.containsKey(deptName)) {
			deptEmployeeMap.get(deptName).add(employeeName);
		} else {
			// If the department doesn't exist, create a new list and add the employee
			List<String> employees = new ArrayList<>();
			employees.add(employeeName);
			deptEmployeeMap.put(deptName, employees);
		}
	}

}
