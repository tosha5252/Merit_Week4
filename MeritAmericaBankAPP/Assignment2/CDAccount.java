package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	
// Instance Variables
	private double cdBalance;
	private double cdInterestRate;
	private int cdTerm;
	private long cdAcctNumber;
	private double cdFutureValue;
	
	

	CDOffering cdOffering;
	private Date date;
	
	
	public CDAccount(CDOffering offering, double balance) {
		super(balance, offering.getInterestRate());
		cdOffering = offering; // This contains the term and interest rate
		cdBalance = balance;
	}
	
	
	public double getBalance() {
		return cdBalance;
	}
	
	
	public double getInterestRate() {
		cdInterestRate = cdOffering.getInterestRate();
		return cdInterestRate;
	}
	

	public int getTerm() {
		cdTerm = cdOffering.getTerm();
		return cdTerm;
	}
	
	
	java.util.Date getStartDate() {
	
		return this.date;
	}
	
	
	public long getAccountNumber() {
		cdAcctNumber = super.getAccountNumber();
		return cdAcctNumber;
	}
	

	public double futureValue() {
		cdFutureValue = cdBalance *
				(Math.pow(1 + cdInterestRate, this.cdOffering.getTerm()));
		return cdFutureValue;
	}
}
