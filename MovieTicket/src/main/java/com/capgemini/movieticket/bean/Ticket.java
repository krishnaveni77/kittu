

	  
package com.capgemini.movieticket.bean;

public class Ticket {
	private Integer ticketid;
	private String seatName;
	private int noOfSeats ;
	private String screenName;
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", seatName=" + seatName + ", noOfSeats=" + noOfSeats + ", screenName="
				+ screenName + "]";
	}
	

	


}
