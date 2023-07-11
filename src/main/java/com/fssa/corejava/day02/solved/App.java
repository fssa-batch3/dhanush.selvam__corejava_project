package com.fssa.corejava.day02.solved;

import com.fssa.corejava.day02.practice.User;

public class App {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setName("Dhanush");
		user1.setId(1);
		user1.setEmail("dhanush@gmail.com");
		user1.setPassword("Aa!12345");
		
		System.out.println(user1.getName());
		System.out.println(user1.getId());
		System.out.println(user1.getEmail());
		System.out.println(user1.getPassword());
		
		Logger.debug("Hi");
		Logger.info("Hello");
		Logger.error("Dhanush");
		Logger.debug(1);
		Logger.info(5);
		Logger.error(10);

	}

}
