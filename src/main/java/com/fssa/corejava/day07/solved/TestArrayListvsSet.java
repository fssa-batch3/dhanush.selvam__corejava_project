package com.fssa.corejava.day07.solved;

import java.util.ArrayList;
import java.util.HashSet;

public class TestArrayListvsSet {

	public static void main(String[] args) {

		// ArrayList stores duplicates
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("Chennai");
		cityNames.add("Bangalore");

		System.out.println("Using ArrayList :" + cityNames);

		// Set stores unique elements and ignores duplication
		HashSet<String> cityNamesSet = new HashSet<String>();
		cityNamesSet.add("Delhi");
		cityNamesSet.add("Chennai");
		cityNamesSet.add("Chennai");
		cityNamesSet.add("Bangalore");

		System.out.println("Using Set :" + cityNamesSet);

	}

}
