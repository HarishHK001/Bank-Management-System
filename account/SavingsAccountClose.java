package com.account;

public class SavingsAccountClose {
	public boolean closeSavingsAccount(SavingsAccount sa)
	{
		boolean isSuccess=true;
		sa.setActive(false);
		System.out.println(sa.getAccnum()+" this account is closed");
		if(sa.isActive()==true)
		{
			isSuccess=false;
		}
		return isSuccess;
	}

}
