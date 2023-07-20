package com.fssa.corejava.day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElementsUsingHashSet {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(2);
		num.add(1);
		System.out.println(num);
		
		HashSet<Integer> uniqueNum = new HashSet<Integer>(num);
		System.out.println(uniqueNum);
		
	}

}
