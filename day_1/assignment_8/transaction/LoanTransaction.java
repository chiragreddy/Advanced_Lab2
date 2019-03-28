package assignment_8.transaction;

import assignment_8.exception.InsufficientFundException;
import assignment_8.fund.BankFund;

public class LoanTransaction extends Thread{

	private BankFund bankFund;
	private int customerId;
	private double loanAmount;
	
	public LoanTransaction(BankFund bankFund,int customerId,double loanAmount) {
		this.loanAmount = loanAmount;
		this.bankFund = bankFund;
		this.customerId = customerId;
	}
	
	public void run() {
		try {
			bankFund.checkFund(loanAmount);
			Thread.sleep((long)(2000*Math.random()));
			double fundAvailable = bankFund.debitFund(loanAmount);
			System.out.println(customerId+"The loan is disbursed." + "Please collect the cash from the Teller");
			System.out.println("Fund left in the bank " + fundAvailable);		
		}
		catch(InsufficientFundException insufficientFundException){
			System.out.println("Sorry!!!"+customerId+"Please try some days later as we are short of funds");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
