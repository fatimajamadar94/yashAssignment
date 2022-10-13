package com.yash.question1;

public class CinemaHall {

	private String cinemaHall;
	private String Timing;
	private Movie movie;

	

	public CinemaHall(String cinemaHall, String timing, Movie movie) {
		super();
		this.cinemaHall = cinemaHall;
		Timing = timing;
		this.movie = movie;
	}

	public String getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(String cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getTiming() {
		return Timing;
	}

	public void setTiming(String timing) {
		Timing = timing;
	}

	public void showcinemaHall() {

		System.out.println("cinema Hall name:"+this.cinemaHall);
		System.out.println("cinema Timing:"+this.Timing);
		movie.showMovieName();
	}

}
