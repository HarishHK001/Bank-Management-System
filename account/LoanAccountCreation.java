package com.account;

public class LoanAccountCreation {
	private static int randnum=10001;
	final private static String acctype="LOAN0000";
	
	public LoanAccount createLoanAccount(String custname, double accbal,int tenure)
	{
		LoanAccount loc=new LoanAccount(acctype+randnum++, accbal,true, custname,tenure);
		return loc;
		
	}

}
