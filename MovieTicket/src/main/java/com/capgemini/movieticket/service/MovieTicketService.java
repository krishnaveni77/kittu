
	  
	package com.capgemini.movieticket.service;

	import java.util.List;


	import com.capgemini.movieticket.bean.PaymentMethod;

	public interface MovieTicketService {
		public boolean BookingMovieTicket();
		public double calculateTotalCost();
		public PaymentMethod ChoosePaymentMethod();
		public boolean makePayment(PaymentMethod option,double a);

		

	}


