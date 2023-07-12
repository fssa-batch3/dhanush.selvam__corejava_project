package com.fssa.corejava.day03.misc;

import java.time.LocalDateTime;

public class Logger {
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void debug(String msg) {
		LocalDateTime t = LocalDateTime.now();
		System.out.println((t.toString()).concat(msg));
	}

	public static void main(String[] args) {
		Logger.info("Hi");
		Logger.debug("Hello");
	}

}
