package com.fssa.corejava.day05.practice;

class Account {
	
	String accNo;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	double balance;
	
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

}
