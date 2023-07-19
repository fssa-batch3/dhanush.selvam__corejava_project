package com.fssa.corejava.day06.solved;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		// Without using Generics

		ArrayList cityList = new ArrayList();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		for (Object object : cityList) {
			String cityName = (String) object; // TypeCast object to String
			System.out.println(cityName);
		}
		
		// With using Generics
		
		ArrayList<String> cityList1  = new ArrayList<String>();
        cityList1.add("Chennai");
        cityList1.add("Bangalore");
        cityList1.add("Mumbai");
         
        // Display the city names
        for (String cityName : cityList1) {           
            System.out.println(cityName);           
        }

	}

}
