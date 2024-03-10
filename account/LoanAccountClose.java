package com.account;

public class LoanAccountClose {
	boolean closeLoanAccount(LoanAccount loa)
	{
		boolean isSuccess=true;
		loa.setActive(false);
		System.out.println(loa.getAccnum()+" this account is closed");
		if(loa.isActive()==true)
		{
			isSuccess=false;
		}
		return isSuccess;
		
	}

}
