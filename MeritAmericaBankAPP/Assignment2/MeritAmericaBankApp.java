package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	private static final double maxBalance = 250000.00;

	public static void main(String[] args) {
		
        //adds CDOfferings		
		MeritBank.getCDOfferings()[0] = new CDOffering(1, .018);  //1yr
		MeritBank.getCDOfferings()[1] = new CDOffering(2, .019);  //2yr
		MeritBank.getCDOfferings()[2] = new CDOffering(3, .02);   //3yr
		MeritBank.getCDOfferings()[3] = new CDOffering(5, .025);  //5yr
		MeritBank.getCDOfferings()[4] = new CDOffering(10, .022); //10yr
		
		System.out.println("=====Merit Bank Account Listings=====");
		System.out.println();
		System.out.println();
		System.out.println();


		//ah1
		AccountHolder ah1 = new AccountHolder("Bridget", "Rae", "Fitzimmons","621-62-1621");
		System.out.println(ah1.toString());

		
		ah1.addCheckingAccount(1000.00);
		ah1.addSavingsAccount(10000.00);

	
		ah1.addCheckingAccount(5000.00);
		ah1.addSavingsAccount(50000.00);

		ah1.addCheckingAccount(50000.00);
		ah1.addSavingsAccount(500000.00);


		ah1.addCheckingAccount(5000.00);
		ah1.addSavingsAccount(50000.00);
		
		System.out.print("Number of Checking Accounts:  ");
		System.out.println(ah1.getNumberOfCheckingAccounts());
		
		System.out.print("Balance:  ");
		System.out.println(ah1.getCheckingBalance());
		
		System.out.print("Number of Savings Accounts:  ");
		System.out.println(ah1.getNumberOfSavingsAccounts());
		
		System.out.print("Savings Account Balance:  ");
		System.out.println(ah1.getSavingsBalance());
		
		
		System.out.print("CD Term in Years:  ");
		System.out.println(MeritBank.getCDOfferings()[2].getTerm());
		
		System.out.print("Interest Rate:  ");
		System.out.println(MeritBank.getCDOfferings()[1].getInterestRate());
		
		if (ah1.getCombinedBalance() > maxBalance) {
			System.out.println("Account balance exceeded.");
		}

		
		ah1.addCDAccount(MeritBank.getBestCDOffering(0), 0);

		
		MeritBank.addAccountHolder(ah1);
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		// ah2
		AccountHolder ah2 = new AccountHolder ("TJ","Andrew", "Detweiler", "216-21-6216");
		System.out.println(ah2.toString());
	
		ah2.addCheckingAccount(1000.00);
		ah2.addSavingsAccount(10000.00);
 
		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(0), 0);
		
		System.out.print("Number of Checking Accounts:  ");
		System.out.println(ah2.getNumberOfCheckingAccounts());
		
		System.out.print("Balance:  ");
		System.out.println(ah2.getCheckingBalance());
		
		System.out.print("Number of Savings Accounts:  ");
		System.out.println(ah2.getNumberOfSavingsAccounts());
		
		System.out.print("Savings Account Balance:  ");
		System.out.println(ah2.getSavingsBalance());
		
		
		System.out.print("CD Term in Years:  ");
		System.out.println(MeritBank.getCDOfferings()[1].getTerm());
		
		System.out.print("Interest Rate:  ");
		System.out.println(MeritBank.getCDOfferings()[0].getInterestRate());
		
		

		
		MeritBank.addAccountHolder(ah2);

	
		MeritBank.clearCDOfferings();

		System.out.println();
		System.out.println();
		System.out.println();
		

		// ah3
		AccountHolder ah3 = new AccountHolder ("Ashley", "Bump", "Spinelli", "999-22-9922");
		System.out.println(ah3.toString());
		
		
		if (ah3.getNumberOfCDAccounts() == 4) {
			System.out.println("Account limit exceeded.");
		}

		
		ah3.addCheckingAccount(1000.00);
		ah3.addSavingsAccount(10000.00);
		
		System.out.print("Number of Checking Accounts:  ");
		System.out.println(ah3.getNumberOfCheckingAccounts());
		
		System.out.print("Balance:  ");
		System.out.println(ah3.getCheckingBalance());
		
		System.out.print("Number of Savings Accounts:  ");
		System.out.println(ah3.getNumberOfSavingsAccounts());
		
		System.out.print("Savings Account Balance:  ");
		System.out.println(ah3.getSavingsBalance());
		
 try {
		

		System.out.print("CD Term in Years:  ");
		System.out.println(MeritBank.getCDOfferings()[1].getTerm());
		
		System.out.print("Interest Rate:  ");
		System.out.println(MeritBank.getCDOfferings()[0].getInterestRate());
		
 } catch (Exception e) {
	 
     System.out.println("No CD account");
 }
	//	System.out.println(MeritBank.getCDOfferings()[0].getInterestRate());
    //		System.out.println(MeritBank.getCDOfferings()[1].getTerm());

		
		MeritBank.addAccountHolder(ah3);
		
		System.out.println();
		System.out.println();
		System.out.println();
	

		// Merit Bank Total Balance
		System.out.println("Merit Bank's Total Balance:");
	
		System.out.println(ah1.getCombinedBalance() + ah2.getCombinedBalance() + ah3.getCombinedBalance());

	}
}
