
	  
	package com.capgemini.movieticket.service;


	import com.capgemini.movieticket.bean.Customer;
	import com.capgemini.movieticket.bean.PaymentMethod;
	import com.capgemini.movieticket.bean.Theater;
	import com.capgemini.movieticket.bean.Ticket;
	import com.capgemini.movieticket.dao.DaoMovieTicket;
	import com.capgemini.movieticket.dao.MovieTicketDao;

	public class MovieTicketServiceImp implements MovieTicketService {

		MovieTicketDao dao = new DaoMovieTicket(); 



		public boolean BookingMovieTicket() {
			// TODO Auto-generated method stub
			return dao.BookingMovieTicket(null);
		}

	


		public double calculateTotalCost() {
			double p=dao.calculateTotalCost();
		double cost,seatprice=1500;
		System.out.println("Each seat price is:1500");
		cost=p*seatprice;
			return cost;
		}

		public PaymentMethod ChoosePaymentMethod() {
			// TODO Auto-generated method stub
			return dao.ChoosePaymentMethod();
		}

		public boolean makePayment(PaymentMethod option, double a) {
			// TODO Auto-generated method stub
			return dao.makePayment(option, a);
		}
		
		public static boolean isValidCustomerid(String c){
			boolean flag= false;
			if(c.length()>=6) {
				flag = true;
			}
				return flag;
		}
		
		public static boolean isValidCustomerName(String s){
			boolean flag= false;
			if(s.length()!=0) {
			flag = true;	
			}
			return flag;
			
		}
		public static boolean isValidCustomerPassword(String p){
			boolean flag= false;
				if(p.length()>=8) {
				flag = true;
			}
			return flag;
			
		}
			
			public static boolean isValidCustomerContact(int contact){
				boolean flag= false;
				String c=contact+"";
				flag=c.matches("[0-10]{10}");
				
				return flag;
				
			}
			public static boolean isValidTheaterid(int id){
				boolean flag= false;
				String i = id+"";
				flag =i.matches("[2][0-9]{3}");				
				
				return flag;
				
			}
			public static boolean isValidTheaterName(String name)
			{
				boolean flag= false;
				if(name!=null); 
				{
					flag = true;
					
				}
				return flag;
				
			}
					
			
	public static boolean isValidTicketid(int id){
		boolean flag= false;
		String i = id+"";
		flag =i.matches("[0-9]{8}");
		return flag;
			
	}
	public static boolean userValidations(Customer c) {
		
		
		boolean flag = false;
	if(isValidCustomerid(c.getCustomerid())&&isValidCustomerName(c.getCustomerName())&&isValidCustomerPassword(c.getCustomerPassword()));                                                                           
		flag= true;

	return flag;


	}

	public static boolean userValidations(Theater c) {



		boolean flag = false;
	if(isValidTheaterid(c.getTheaterid())&&isValidTheaterName(c.getTheaterName()));
	flag = true;
	return flag;
	}


	public static boolean userValidations(Ticket c) {
		
		boolean flag = false;

	if(isValidTicketid(c.getTicketid()));  
	flag = true;
	return flag;
	}
	}




