package com.capgemini.movieticket.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String customerid;
	private String customerName;
	private String customerPassword;
	private LocalDate dateOfBirth;
	List<Integer> myTickets = new ArrayList<Integer>();
	private String customerContact;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<Integer> getMyTickets() {
		return myTickets;
	}
	public void setMyTickets(List<Integer> myTickets) {
		this.myTickets = myTickets;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", dateOfBirth=" + dateOfBirth + ", myTickets=" + myTickets + ", customerContact="
				+ customerContact + "]";
	}
	
	

	
}
