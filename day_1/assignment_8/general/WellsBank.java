package assignment_8.general;

import assignment_8.fund.BankFund;
import assignment_8.transaction.LoanTransaction;

public class WellsBank {
	
	public static void main(String[] args) throws InterruptedException {

	BankFund WellsBankFund = new BankFund(9000000);
	
	LoanTransaction[] loanTransactions = new LoanTransaction[100];
	for(int index = 0; index < loanTransactions.length;index++) {
		loanTransactions[index] = new LoanTransaction(WellsBankFund, (1000+index),25000);
	}
	
	for(int index = 0; index < loanTransactions.length;index++) {
		loanTransactions[index].start(); // starting thread
	}
	
	}
}