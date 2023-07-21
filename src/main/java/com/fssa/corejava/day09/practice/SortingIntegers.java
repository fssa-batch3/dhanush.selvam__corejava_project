package com.fssa.corejava.day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortingIntegers {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(2);
		arr.add(5);
	
		System.out.println(arr);
		Collections.sort(arr);
		System.out.print(arr);
		
	}

}
