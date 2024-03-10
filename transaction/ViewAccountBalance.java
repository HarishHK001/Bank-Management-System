package com.transaction;

import com.account.Account;


public class ViewAccountBalance {
	
//	public void viewBalance(SavingsAccount a)
//	{
//		System.out.println("Account Balance Rs "+a.getAccbal());
//	}
//	public void viewBalance(LoanAccount a)
//	{
//		System.out.println("Account Balance Rs "+a.getAccbal());
//	}
	
	public void viewBalance(Account a)
	{
		
		if(a.isActive())
		{
			System.out.println("Account Balance Rs "+a.getAccbal());
		}
		else
		{
			System.out.println("Inactive account");
		}
	}

}
