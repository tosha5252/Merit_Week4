package com.meritamerica.assignment2;

public class BankAccount {

// Instance Variables
	private double balance;
	private double interestRate;
	private double futureValue;
	private long accountNumber;

// Super Constructor 
	public BankAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
		accountNumber = MeritBank.getNextAccountNumber();
	}

// Super Constructor
	public BankAccount(long accountNumber, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	
	public long getAccountNumber() {
		return accountNumber;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public double getInterestRate() {
		return interestRate;
	}
