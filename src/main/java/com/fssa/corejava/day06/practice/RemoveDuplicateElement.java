package com.fssa.corejava.day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		List<String> uniqueCity = new ArrayList<String>();
		for (int i = 0; i < cityList.size(); i++) {
			if (!uniqueCity.contains(cityList.get(i))) {
				uniqueCity.add(cityList.get(i));
			}
		}
		System.out.println(uniqueCity);
		
	}

}
