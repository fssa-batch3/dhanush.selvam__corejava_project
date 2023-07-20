package com.fssa.corejava.day08.practice;

import java.util.HashMap;

public class CountNames {

	public static void main(String[] args) {
		
		String [] names = {"Ram", "Ram", "Superman", "Spider", "hey", "hello", "hey", "Spider"};
		
		HashMap<String, Integer> uniqueNames = new HashMap<>();
		
        for (String name : names) {
        	uniqueNames.put(name, uniqueNames.getOrDefault(name, 0) + 1);
        }
        
        for (String name : uniqueNames.keySet()) {
			Integer count = uniqueNames.get(name);
			System.out.println(name + ": " + count);
		}
  
	}

}
