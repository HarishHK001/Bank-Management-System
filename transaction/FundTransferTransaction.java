package com.transaction;

import com.account.Account;
import com.account.LoanAccount;
import com.account.SavingsAccount;

public class FundTransferTransaction {
	
	public void fundTransfer(Account fromAcc,Account toAcc, double amount )
	{
		if(fromAcc.isActive() && toAcc.isActive())
		{
			if(fromAcc instanceof SavingsAccount && toAcc instanceof SavingsAccount)
			{
				fromAcc.withdraw(amount);
				toAcc.deposit(amount);
				
			}
			else if(fromAcc instanceof SavingsAccount && toAcc instanceof LoanAccount)
			{
				fromAcc.withdraw(amount);
				toAcc.deposit(amount);
			}
			
		}
		else
		{
			System.out.println("one of the account is not active");
			
		}
	}

}
