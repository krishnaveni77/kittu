
	  
	package com.capgemini.movieticket.bean;

	public class Seat {
	private int seatId;
	private double seatPrice;
	private int noOfseats;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	public int getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result =prime*result+seatId;
		long temp;
		temp =Double.doubleToLongBits(seatPrice);
		result= prime*result+(int)(temp^(temp>>>32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
			if(this==obj)
				return true;
			if(obj==null)
				return false;
		    if (getClass()!=obj.getClass())
			return false;
		   Seat other = (Seat) obj;
		   if(seatId!=other.seatId)
			return false;
		   if(Double.doubleToLongBits(seatPrice)!=Double.doubleToLongBits(other.seatPrice))
			   return false;
		return true;
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatPrice=" + seatPrice + ", noOfseats=" + noOfseats + "]";
	}

	

}
