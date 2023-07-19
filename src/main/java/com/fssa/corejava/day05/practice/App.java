package com.fssa.corejava.day05.practice;

public class App {

	public static void main(String[] args) {

		Account user1 = new Account("A0001", 10000);

		ATM axis = new AxisATM();
		System.out.println("Deposit Status: " + axis.deposit(user1, 2000));
		System.out.println("Your Balance: " + axis.getBalance(user1));
		try {
			System.out.println("Withdraw Status: " + axis.withdraw(user1, 5000));
		} catch (Exception e) {
			System.out.println("Withdraw Status: false");
			System.out.println(e.getMessage());
		}
		System.out.println("Your Balance: " + axis.getBalance(user1));

		Account user2 = new Account("I0001", 15000);

		ATM icici = new IciciATM();
		System.out.println("Deposit Status: " + icici.deposit(user2, 5000));
		System.out.println("Your Balance: " + icici.getBalance(user2));
		try {
			System.out.println("Withdraw Status: " + icici.withdraw(user2, 12000));
		} catch (Exception e) {
			System.out.println("Withdraw Status: false");
			System.out.println(e.getMessage());
		}
		System.out.println("Your Balance: " + icici.getBalance(user2));

	}

}
