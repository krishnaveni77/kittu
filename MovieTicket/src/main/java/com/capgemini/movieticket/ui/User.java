
	package com.capgemini.movieticket.ui;
 
	import java.util.Random;
import java.util.Scanner;

	import com.capgemini.movieticket.bean.Customer;
import com.capgemini.movieticket.bean.PaymentMethod;
import com.capgemini.movieticket.bean.Seat;
import com.capgemini.movieticket.bean.Theater;
	import com.capgemini.movieticket.exception.MovieException;
import com.capgemini.movieticket.service.MovieTicketService;
import com.capgemini.movieticket.service.MovieTicketServiceImp;


	public class User {

		private static final MovieTicketService service = null;

		public static void main(String[] args) throws MovieException {
			// TODO Auto-generated method stub
			Customer cust = new Customer();
			Theater t = new Theater();
			MovieTicketServiceImp m = new MovieTicketServiceImp();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter CustomerName");
			String customername= input.nextLine();
			System.out.println("Enter CustomerId");
			int Customerid = input.nextInt();
			System.out.println("Enter CustomerPassword");
			String password= input.nextLine();
			input.nextLine();
			System.out.println("Enter CustomerContact");
			long Customercontact= input.nextLong();
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
			PaymentMethod option=new PaymentMethod();
			Seat bean=new Seat();
			MovieTicketService s=new  MovieTicketServiceImp();
			User obj=new User();
			Scanner sc = new Scanner(System.in);
			int s1,s2;
			double tcost;
			int tseats;
			System.out.println("enter no of seats");
			tseats=sc.nextInt();
			bean.setNoOfseats(tseats);
			
			tcost=service.calculateTotalCost();
			System.out.println("total cost= "+tcost);
			PaymentMethod option1= obj.choosePaymentMethod();
			boolean status = service.makePayment(option, tcost);
			System.out.println("eneter your card number");
			long cardnumber=sc.nextLong();
			System.out.println("enter your cvv:");
			int cvv=sc.nextInt();
			if(status) {
				System.out.println("payment successful");
				System.out.println("ticket is booked");
				
			}
			Random r = new Random();
			int randomNumber=r.nextInt();
		System.out.println("your booking id is:"+randomNumber);
			
			}
		}
			
			public  PaymentMethod choosePaymentMethod() {
				Scanner scan= new Scanner(System.in);
				int ch,ch1=1;
				while(ch1!=0)
				{
					System.out.println("1.credit card");
					System.out.println("2.debit card");
					ch=scan.nextInt();
					switch(ch)
					{
					case 1:
						PaymentMethod method=service.ChoosePaymentMethod();
						return method;
					case 2:
					PaymentMethod method1=service.ChoosePaymentMethod();
					return method1;
					default:
						System.out.println("wrong choice");
						
				
			}
			
				}
				return null;	
				
			}
	}
			


