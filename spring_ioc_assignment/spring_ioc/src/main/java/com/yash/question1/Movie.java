package com.yash.question1;

public class Movie {

	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	void showMovieName() {
		System.out.println("Movie:"+this.movieName);
	}
}
