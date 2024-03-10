package com.admin;

import com.account.LoanAccount;
import com.account.LoanAccountClose;
import com.account.LoanAccountCreation;
import com.account.SavingsAccount;
import com.account.SavingsAccountClose;
import com.account.SavingsAccountCreation;
import com.transaction.AccountDepositTransaction;
import com.transaction.AccountWithdrawTransaction;
import com.transaction.ViewAccountBalance;
import com.transaction.FundTransferTransaction;

public class StartBankApp {
	
	public static void main(String[] args) {
		System.out.println("\t\t Welcome to HK Banking System");
		System.out.println();
		
		
		SavingsAccountCreation sac=new SavingsAccountCreation();
		LoanAccountCreation lac=new LoanAccountCreation();
		SavingsAccountClose saclose=new SavingsAccountClose();
		LoanAccountClose laclose= new LoanAccountClose();
		
		ViewAccountBalance vab=new ViewAccountBalance();
		AccountDepositTransaction adt=new AccountDepositTransaction();
		AccountWithdrawTransaction adw=new AccountWithdrawTransaction();
		
		System.out.println("Savings Account details");
		System.out.println("------------------------");
		SavingsAccount sa=sac.createSavingAccount("Ramesh", 25000.10);
		vab.viewBalance(sa);
		adt.depositTxn(sa,5000);
		vab.viewBalance(sa);
		adw.withdrawTxn(sa, 1000000);
		vab.viewBalance(sa);
		
		System.out.println();
		
		System.out.println("Loan Account details");
		System.out.println("--------------------");
		LoanAccount la=lac.createLoanAccount("kumar", 25000.10,3);
		vab.viewBalance(la);
		adt.depositTxn(la,5000);
		vab.viewBalance(la);
		adw.withdrawTxn(la, 10000);
		vab.viewBalance(la);
		
		System.out.println();
		
		System.out.println("Account Close");
		System.out.println("--------------");
		saclose.closeSavingsAccount(sa);
		adt.depositTxn(sa, 50000);
		vab.viewBalance(sa);
		
	
		System.out.println();
		
		
		
		
		System.out.println("============Found transfer========");
		
		FundTransferTransaction ftt=new FundTransferTransaction();
		
		SavingsAccount sa2=sac.createSavingAccount("Harish", 10000.0);
		SavingsAccount sa3=sac.createSavingAccount("Harishkunar", 10000.0);
		
		vab.viewBalance(sa2);
		ftt.fundTransfer(sa2, sa3, 5000);
		vab.viewBalance(sa2);
		vab.viewBalance(sa3);
		
		
		
		
		
	}

}
