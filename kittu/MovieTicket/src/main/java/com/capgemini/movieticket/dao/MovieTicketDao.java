package com.capgemini.movieticket.dao;

import java.util.List;

import com.capgemini.movieticket.bean.Customer;
import com.capgemini.movieticket.bean.PaymentMethod;
import com.capgemini.movieticket.bean.Theater;
import com.capgemini.movieticket.bean.Ticket;

public interface MovieTicketDao {
	
	public boolean BookingMovieTicket(Theater c);
	public boolean CancelMovieTicket(Ticket c);
	public double calculateTotalCost();
	public PaymentMethod ChoosePaymentMethod();
	public boolean makePayment(PaymentMethod option,double a);

	

}
