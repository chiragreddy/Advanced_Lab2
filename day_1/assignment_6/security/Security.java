package assignment_6.security;

import assignment_6.account.Account;
import assignment_6.Customer.Customer;
import assignment_6.exception.UnAuthorizedWithdrawTransactionException;

public class Security {

	public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException {
		
		if(account.getCustomer().getCustomerId() != customer.getCustomerId())
			throw new UnAuthorizedWithdrawTransactionException();
		
	}
	
}
