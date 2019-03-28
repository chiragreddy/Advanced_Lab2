package assignment_6.exception;

public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException() {
		super("Insufficient Balance in the account");
	}
	
}
