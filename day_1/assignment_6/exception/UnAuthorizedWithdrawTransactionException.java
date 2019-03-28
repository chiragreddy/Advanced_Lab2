package assignment_6.exception;

public class UnAuthorizedWithdrawTransactionException extends Exception{
	
	public UnAuthorizedWithdrawTransactionException() {
		super("The user is unauthorized for the withdrawal");
	}
	
}