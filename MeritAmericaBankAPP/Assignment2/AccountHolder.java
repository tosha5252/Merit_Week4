package com.meritamerica.assignment2;

public class AccountHolder {

	
	private static final double maxBalance = 250000.00;

// Instance Variables
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private int numOfCheckingAccounts = 0;
	private int numOfSavingsAccounts = 0;
	private int numOfCDAccounts = 0;

//Objects
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	private CDAccount cdAccount;

	
	private CheckingAccount[] checkingAccountsArray = new CheckingAccount[7];
	private SavingsAccount[] savingsAccountsArray = new SavingsAccount[7];
	private CDAccount[] cdAccountsArray = new CDAccount[50];


	
	public AccountHolder() {
	
	}



	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;

	}

	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getMiddleName() {
		return middleName;
	}

	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getSSN() {
		return ssn;
	}


	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		checkingAccount = new CheckingAccount(openingBalance);
		addCheckingAccount(checkingAccount);
		return checkingAccount;
	}


	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		double totalCheckingsAndSavingsBalance = 0;
		totalCheckingsAndSavingsBalance = getSavingsBalance() + getCheckingBalance() + checkingAccount.getBalance();
		if (totalCheckingsAndSavingsBalance > maxBalance) {
			System.out.println("Maximum account balance exceeded.");
			return null;
		} else {
			checkingAccountsArray[numOfCheckingAccounts] = checkingAccount;
			numOfCheckingAccounts++;
		}
		return checkingAccount;

	}

	
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccountsArray;
	}

	
	public int getNumberOfCheckingAccounts() {
		return numOfCheckingAccounts;
	}

	
	public double getCheckingBalance() {
		double checkingAccountBalance = 0;

		for (int i = 0; i < getNumberOfCheckingAccounts(); i++) {
			checkingAccountBalance += checkingAccountsArray[i].getBalance();
		}
	
		return checkingAccountBalance;
	}


	public SavingsAccount addSavingsAccount(double openingBalance) {
		savingsAccount = new SavingsAccount(openingBalance);
		addSavingsAccount(savingsAccount);
		return savingsAccount;
	}

	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		double totalCheckingsAndSavingsBalance = 0;
		totalCheckingsAndSavingsBalance = getSavingsBalance() + getCheckingBalance() + savingsAccount.getBalance();
		if (totalCheckingsAndSavingsBalance > maxBalance) {
			System.out.println("****Total Account Balance cannot be over $250,000.****");

			return null;
		} else {
			savingsAccountsArray[numOfSavingsAccounts] = savingsAccount;
			numOfSavingsAccounts++;
		}
		return savingsAccount;
	}


	public SavingsAccount[] getSavingsAccounts() {
		return savingsAccountsArray;
	}

	public int getNumberOfSavingsAccounts() {
		return numOfSavingsAccounts;
	}


	public double getSavingsBalance() {
		double savingsAccountBalance = 0;
		for (int i = 0; i < getNumberOfSavingsAccounts(); i++) {
			savingsAccountBalance += savingsAccountsArray[i].getBalance();
		}
	
		return savingsAccountBalance;
	}


	// 
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		cdAccount = new CDAccount(offering, openingBalance);
		addCDAccount(cdAccount);
		return cdAccount;

	}

	public CDAccount addCDAccount(CDAccount cdAccount) {
		cdAccountsArray[numOfCDAccounts] = cdAccount;
		numOfCDAccounts++;
		return cdAccount;
	}

	
	public CDAccount[] getCDAccounts() {
		return cdAccountsArray;
	}

	
	public int getNumberOfCDAccounts() {
		return numOfCDAccounts;
	}


	public double getCDBalance() {
		double cdsAccountBalance = 0;
		for (int i = 0; i < getNumberOfCDAccounts(); i++) {
			cdsAccountBalance += cdAccountsArray[i].getBalance();
		}

	
		return cdsAccountBalance;
	}

	
	public double getCombinedBalance() {
		double totalAccountsBalance = 0;
		totalAccountsBalance = getCheckingBalance() + getSavingsBalance() + getCDBalance();
		return totalAccountsBalance;
	}

	
	@Override
	public String toString() {
		String accountHolderInfo = "Name: " + getFirstName() + " " + getMiddleName()
		+ " " + getLastName() +
		"\nSSN: " + getSSN() + "\n";

		
		return accountHolderInfo;
	}
}
