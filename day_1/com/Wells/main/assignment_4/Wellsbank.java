package com.Wells.main.assignment_4;

import java.util.*;
import com.Wells.customer.assignment_4.Customer;
import com.Wells.DB.assignment_4.CustomerDB;
import com.Wells.login.assignment_4.Login;

public class Wellsbank {
	
	private static final CustomerDB customerDB = new CustomerDB();
	
	private static final Login login = new Login();
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer(1001,"Tan",false);
		customerDB.saveCustomer(cust1);
		login.addLogin(1001,"Wells123");
		
		Customer cust2 = new Customer(1002,"John",true);
		customerDB.saveCustomer(cust2);
		login.addLogin(1002,"Wells123");
		
		Customer cust3 = new Customer(1003,"Sam",true);
		customerDB.saveCustomer(cust3);
		login.addLogin(1003,"Mys@123");
		
		Customer cust4 = new Customer(1004,"Raj",false);
		customerDB.saveCustomer(cust4);
		login.addLogin(1004,"Wells123");
		
		List<Customer> customerList = customerDB.getAllCustomers();
		
		if(customerList.isEmpty()) {
			System.out.println("No Customers in the Bank");
		}
		else {
			printCustomerList(customerList);
		}
		
		Set<Integer> loanAvailedCustomers = customerDB.getLoanAvailedCustomers();
		System.out.println("\nCustomers who have availed the loan: ");
		System.out.println("----------------------------------");
		for(int custId: loanAvailedCustomers) {
			System.out.println(custId);
		}
	}
	
	public static void printCustomerList(List<Customer> customerList) {
		
		Iterator<Customer> custIterator = customerList.iterator();
		System.out.println("                     Customer Details");
		System.out.println("-------------------------------------");
		System.out.println("cust Id\t customer Name\t Loan Availed");
		
		while(custIterator.hasNext()) {
			
			Customer customer = custIterator.next();
			System.out.print(customer.getCustomerId() + "\t");
			System.out.print("\t" + customer.getCustomerName() + "\t\t");
			
			String displayString = "NO";
			if(customer.isLoanAvailed()) {
				displayString = "YES";
			}
			System.out.println(displayString);
		}
		
		
	}
	
}
