package com.meritamerica.assignment2;

import java.text.DecimalFormat;

public class SavingsAccount extends BankAccount {
	
	//Instance Variable
	private static double savingsInterestRate = 0.01;
	
	DecimalFormat money = new DecimalFormat("0.00");
	
	// Constructor 
	public SavingsAccount(double openingBalance){
		super(openingBalance, savingsInterestRate);
		
	}
	 	@Override
public String toString() {
		String savingsInfo = "\nSavings Account Balance: $" + money.format(getBalance()) + 
				"\nSavings Account Interest Rate: " + getInterestRate() +
				"\nSavings Account Balance in 3 years: $" + money.format(futureValue(3)) + "\n";
		return savingsInfo;
	}	
}  
