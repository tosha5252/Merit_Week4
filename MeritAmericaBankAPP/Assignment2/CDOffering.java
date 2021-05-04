package com.meritamerica.assignment2;

public class CDOffering {
	
// Instance Variables 
	private int cdOfferingTerm;
	private double cdOfferingInterestRate;
	
	
// Constructor
	public CDOffering(int term, double interestRate) {
		cdOfferingTerm = term;
		cdOfferingInterestRate = interestRate;
	}
	
	 
	public int getTerm() {
		return cdOfferingTerm;
	}
	
 
	double getInterestRate() {
		return cdOfferingInterestRate;
	}

}
