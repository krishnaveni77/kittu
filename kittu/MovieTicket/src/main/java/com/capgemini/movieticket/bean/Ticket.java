package com.capgemini.movieticket.bean;

public class Ticket {
	private Integer ticketid;
	String seatName;
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
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", seatName=" + seatName + "]";
	}
	
	
	

}
