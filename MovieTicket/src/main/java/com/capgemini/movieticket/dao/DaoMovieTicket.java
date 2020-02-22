
package com.capgemini.movieticket.dao;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


import com.capgemini.movieticket.bean.PaymentMethod;
import com.capgemini.movieticket.bean.Seat;

public class DaoMovieTicket implements MovieTicketDao {
	List<Seat> list = new ArrayList<Seat>();

	public double calculateTotalCost() {
		// TODO Auto-generated method stub
		double tseats;
		Scanner sc = new Scanner(System.in);
		Seat bean = new Seat();
		tseats = (double) bean.getNoOfseats();

		return tseats;
	}

	public PaymentMethod ChoosePaymentMethod() {
		// TODO Auto-generated method stub
		PaymentMethod x = new PaymentMethod();
		x.getOption();

		return x;
	}

	public boolean makePayment(PaymentMethod option, double a) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean BookingMovieTicket(PaymentMethod option) {
		// TODO Auto-generated method stub
		double tcost = calculateTotalCost();

		if (makePayment(option, tcost)) {
			return true;
		} else {
			return false;
		}
 
	}

	
}
