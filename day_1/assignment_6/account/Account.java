package assignment_6.account;

import assignment_6.Customer.Customer;

public class Account {
		
		private int accountNo;
		
		private Customer customer;
		
		protected double balance;
		
		public Account(int accountNo, Customer customer, double balance) {
			this.accountNo = accountNo;
			this.balance = balance;
			this.customer = customer;
		}
		
		public Account() {}

		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public int getAccountNo() {
			return accountNo;
		}

		public Customer getCustomer() {
			return customer;
		}

		public double getBalance() {
			return balance;
		}
		
	
}
