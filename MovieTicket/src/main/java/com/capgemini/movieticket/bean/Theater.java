
package com.capgemini.movieticket.bean;

import java.util.ArrayList;
import java.util.List;

public class Theater {
	private int Theaterid;
	private String TheaterName;
	private String TheaterCity;
	private List<String> movies = new ArrayList<String>();

	public int getTheaterid() {
		return Theaterid;
	}

	public void setTheaterid(int theaterid) {
		Theaterid = theaterid;
	}

	public String getTheaterName() {
		return TheaterName;
	}

	public void setTheaterName(String theaterName) {
		TheaterName = theaterName;
	}

	public String getTheaterCity() {
		return TheaterCity;
	}

	public void setTheaterCity(String theaterCity) {
		TheaterCity = theaterCity;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Theater [Theaterid=" + Theaterid + ", TheaterName=" + TheaterName + ", TheaterCity=" + TheaterCity
				+ ", movies=" + movies + "]";
	}

}
