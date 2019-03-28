package com.Wells.customer.assignment_4;

public class Customer {
	
	private int customerId;
	private String customerName;
	private boolean loanAvailed;
	
	
	public Customer(int customerId, String customerName, boolean loanAvailed  ) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.loanAvailed = loanAvailed;
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setLoanAvailed(boolean loanAvailed) {
		this.loanAvailed = loanAvailed;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public boolean isLoanAvailed() {
		return loanAvailed;
	}
	
}
