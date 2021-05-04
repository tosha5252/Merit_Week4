package com.meritamerica.assignment2;

import java.util.Random;

public class MeritBank {


	private static int numOfAccountHolders = 0;

	
	private static Random randomNumber = new Random();

	
	private static AccountHolder[] accountHoldersArray = new AccountHolder[100];
	private static CDOffering[] cdOfferingsArray = new CDOffering[5];


	
	public static void addAccountHolder(AccountHolder accountHolder) {
		accountHoldersArray[numOfAccountHolders] = accountHolder;
		numOfAccountHolders++;
	}


	public static AccountHolder[] getAccountHolders() {
		return accountHoldersArray;
	}

	
	public static CDOffering[] getCDOfferings() {
		return cdOfferingsArray;
	}


	public static CDOffering getBestCDOffering(double depositAmount) {
		double presentValue = 0;
		double largestFutureValue = 0;
		int indexOfLargestFutureValue = 0;
		for (int i = 0; i < cdOfferingsArray.length; i++) {
			presentValue = futureValue(depositAmount, cdOfferingsArray[i].getInterestRate(),
					cdOfferingsArray[i].getTerm());

			if (presentValue > largestFutureValue) {
				largestFutureValue = presentValue;
				indexOfLargestFutureValue = i;
			}
		}
		return cdOfferingsArray[indexOfLargestFutureValue];
	}

	
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		double presentValue = 0;
		double largestFutureValue = 0;
		double secondLargestFutureValue = 0;
		int indexOfLargestFutureValue = 0;
		int indexOfSecondLargestFutureValue = 0;
		for (int i = 0; i < cdOfferingsArray.length; i++) {
			presentValue = futureValue(depositAmount, cdOfferingsArray[i].getInterestRate(),
					cdOfferingsArray[i].getTerm());

			if (presentValue > largestFutureValue) {
				largestFutureValue = presentValue;
				indexOfLargestFutureValue = i;
			} 
			if (presentValue < largestFutureValue && 
					presentValue > secondLargestFutureValue) {
				secondLargestFutureValue = presentValue;
				indexOfSecondLargestFutureValue = i;
			}
		}
		return cdOfferingsArray[indexOfSecondLargestFutureValue];

	}

	
	public static void clearCDOfferings() {
		cdOfferingsArray = null;
	}

	
	public static void setCDOfferings(CDOffering[] offerings) {
		cdOfferingsArray = offerings; 
	}

	
	public static long getNextAccountNumber() {
		return randomNumber.nextLong();
	}

	
	public static double totalBalances() {
		double totalBalance = 0;
		for (AccountHolder account : accountHoldersArray) {
			totalBalance += account.getCombinedBalance();
		}
		return totalBalance;
	}

	public static double futureValue(double presentValue, double interestRate, int term) {
		double futureValueOfMeritBank = 0;
		futureValueOfMeritBank = presentValue * (Math.pow(1 + interestRate, term));
		return futureValueOfMeritBank;
	}
}
