package com.meritamerica.assignment2;

import java.text.DecimalFormat;

public class CheckingAccount extends BankAccount {


// Instance Variable

	private static double checkingAccountInterestRate = 0.0001;
	


	DecimalFormat money = new DecimalFormat("0.00");
	DecimalFormat percentage = new DecimalFormat("0.0000");

	public CheckingAccount(double openingBalance) {

		super(openingBalance, checkingAccountInterestRate);
	}

	
	@Override
	public String toString() {
		String checkingInfo = "\nChecking Account Balance: $" + money.format(getBalance()) + 
				"\nChecking Account Interest Rate: " + percentage.format(getInterestRate()) +
				"\nChecking Account Balance in 3 years: $" + money.format(futureValue(3));
		return checkingInfo;
	}
}
