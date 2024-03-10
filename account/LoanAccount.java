package com.account;

public class LoanAccount extends Account{
	
	private int tenure;//duration

	public LoanAccount(String accnum, double accbal, boolean isActive, String custname, int tenure) {
		super(accnum, accbal, isActive, custname);
		this.tenure = tenure;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	public void deposit(double amt)
	{
		System.out.println("depositing Rs"+amt);
		this.setAccbal(this.getAccbal()-amt);
	}
	public void withdraw(double amt)
	{
		System.out.println("Withdrawing Rs"+amt);
		this.setAccbal(this.getAccbal()+amt);
	}
	
	

	
	
	
	

}
