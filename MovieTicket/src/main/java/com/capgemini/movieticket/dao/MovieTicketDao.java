
	  
	package com.capgemini.movieticket.dao;

	
	import com.capgemini.movieticket.bean.PaymentMethod;
	
	public interface MovieTicketDao {
		
		public boolean BookingMovieTicket(PaymentMethod option);
		public double calculateTotalCost();
		public PaymentMethod ChoosePaymentMethod();
		public boolean makePayment(PaymentMethod option,double a);

		

	}


