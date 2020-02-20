package com.capgemini.movieticket.ui;

import java.util.Scanner;

import com.capgemini.movieticket.bean.Customer;
import com.capgemini.movieticket.bean.Theater;
import com.capgemini.movieticket.exception.MovieException;
import com.capgemini.movieticket.service.MovieTicketServiceimp;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		Theater t = new Theater();
		MovieTicketServiceimp m = new MovieTicketServiceimp();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter CustomerName");
		String customername= input.nextLine();
		System.out.println("Enter CustomerId");
		int Customerid = input.nextInt();
		System.out.println("Enter CustomerPassword");
		String password= input.nextLine();
		input.nextLine();
		System.out.println("Enter CustomerContact");
		int Customercontact= input.nextInt();
		System.out.println("1.Booking the ticket");
		System.out.println("2.Canceling the ticket");
		System.out.println("choose your action");
		int action = input.nextInt();

		switch (action) {
		case 1: System.out.println("Booking ticket");
		System.out.println("enter theater name(name should not be null)");
		String theaterName= input.nextLine();
		input.nextLine();
		System.out.println("enter theater id(id must be min 4 digit Stsrting with 2)");
		int theaterid=input.nextInt();
		System.out.println("enter movie name");
		String movie=input.nextLine();
		input.nextLine();	
		System.out.println("enter city name");
		String city= input.next();
		t.setTheaterid(theaterid);
		t.setTheaterCity(city);
		t.setTheaterName(theaterName);
		try
		{
		boolean valid = MovieTicketServiceimp.userValidations(cust);
		if(valid)
		{
				m.BookingMovieTicket(t);
			
			 System.out.println("Movie Ticket Booked");

		}
		}
		catch(MovieException e)
		
		{
			System.out.println(e.getMessage());
		}
		break;
		
		}

	}

	}

