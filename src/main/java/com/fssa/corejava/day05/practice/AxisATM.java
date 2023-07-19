package com.fssa.corejava.day05.practice;

public class AxisATM implements ATM {
	
	@Override
	public boolean deposit(Account account,double amount) {
		account.setBalance(account.getBalance() + amount);
		return true;
	}
	
	@Override
	public boolean withdraw(Account account,double amount) throws Exception {
		
		double balance = account.getBalance();
		if (balance > 5000) {
			account.setBalance(account.getBalance() - (amount + 5));
			return true;
		}
		else throw new Exception("Minimum amount should be 5000");
		
	}
	
	@Override
	public double getBalance(Account account) {
		return account.getBalance();
	}
	
}
