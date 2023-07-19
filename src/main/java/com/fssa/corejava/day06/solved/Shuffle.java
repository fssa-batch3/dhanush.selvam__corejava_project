package com.fssa.corejava.day06.solved;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	
	public static void main(String[] args) {
		
		String [] arr = {"dhanush","vijay","surya"};
		List<String> list = Arrays.asList(arr);
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}
