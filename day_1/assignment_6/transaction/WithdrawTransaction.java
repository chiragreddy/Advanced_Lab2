package assignment_6.transaction;

import assignment_6.Customer.Customer;
import assignment_6.account.Account;
import assignment_6.exception.InsufficientBalanceException;
import assignment_6.exception.UnAuthorizedWithdrawTransactionException;
import assignment_6.security.Security;


public class WithdrawTransaction extends Security implements Runnable{
	
	private int transactionId;
	private Account account;
	private Customer customer;
	private double amount;
	
	public WithdrawTransaction(int transactionId, Account account, Customer customer, double amount) {
		this.transactionId = transactionId;
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}
	
	// Thread-safe
	
	public synchronized double withdraw(Account account, double amount) throws InsufficientBalanceException{
		if(account.getBalance() >= amount) {
			account.setBalance(account.getBalance() - amount);
		}
		else {
			throw new InsufficientBalanceException();
		}
		return account.getBalance();
	}
	
	public void run() {
		try {
			authorization(account,customer);
			double balance = withdraw(account,amount);
			System.out.println(transactionId + " transaction"+"completed!!! and the balance amount is "+ balance);	
		}
		catch(UnAuthorizedWithdrawTransactionException unAuthorizedWithdrawTransactionException) {
			System.out.println(transactionId+" transaction "+"failed!!! and "+ unAuthorizedWithdrawTransactionException.getMessage());
		}
		catch(InsufficientBalanceException insufficientBalanceException) {
			System.out.println(transactionId+" transaction " + "failed!!! and your account has insufficcient balance");
		}
	}
}