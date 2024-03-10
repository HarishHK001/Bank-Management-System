package com.account;

public class SavingsAccountCreation {
	private static int randnum=10001;
	final private static String acctype="SAV0000";
	
	public SavingsAccount createSavingAccount(String custname, double accbal)
	{
		SavingsAccount sav=new SavingsAccount(acctype+randnum++,accbal,true,custname);
		return sav;
	}

}
