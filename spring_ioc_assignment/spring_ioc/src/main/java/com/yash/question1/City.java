package com.yash.question1;

public class City {
	
	private String cityName;
	
	private CinemaHall cinemaHall;

	public String getcityName() {
		return cityName;
	}

	public void setcityName(String cityName) {
		cityName = cityName;
	}

	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public City(String cityName, CinemaHall cinemaHall) {
		super();
		this.cityName = cityName;
		this.cinemaHall = cinemaHall;
	}
	
	public void showcitytime() {
		System.out.println("cityName:"+this.cityName);
		cinemaHall.showcinemaHall();
	}

}
