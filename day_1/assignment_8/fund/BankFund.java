package assignment_8.fund;
import assignment_8.exception.InsufficientFundException;

public class BankFund {

	private double fund;
	
	public BankFund(double fund) {
		this.fund = fund;
	}
	
	public int checkFund(double amount) throws InsufficientFundException{
		if(fund<amount) {
			throw new InsufficientFundException("Insufficient fund");
		}
		return 0;
	}
	
	// Thread safe 
	
	public synchronized double debitFund(double amount) {
		fund -= amount;
		
		return fund;
	}
	
}
