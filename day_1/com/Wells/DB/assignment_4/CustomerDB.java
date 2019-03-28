package com.Wells.DB.assignment_4;

import java.util.*;

import com.Wells.customer.assignment_4.Customer;

public class CustomerDB {
	
	private List<Customer> customerList = new ArrayList<Customer>();
	
	public boolean saveCustomer(Customer customer) {
		
		boolean status = false;
		status = customerList.add(customer);
		return status;
		
	}
	
	public List<Customer> getAllCustomers(){
		return customerList;
	}
	
	public Set<Integer> getLoanAvailedCustomers(){
		
		Set<Integer> loanAvailedCustomers = new TreeSet<Integer>();
		Iterator<Customer> customerIterator = customerList.iterator();
		
		while(customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			
			if(customer.isLoanAvailed()) {
				loanAvailedCustomers.add(customer.getCustomerId());
			}
		}
		
		return loanAvailedCustomers;
	}
	
	
}
