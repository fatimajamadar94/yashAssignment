package com.yash.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("1");
//		Movie movie=(Movie) applicationContext.getBean("movie1");
//		movie.showMovieName();
//		CinemaHall cinemaHall=(CinemaHall) applicationContext.getBean("cinemahall1");
//		cinemaHall.showcinemaHall();
		City c =(City) applicationContext.getBean("city1");
		c.showcitytime();
		
		City c1 =(City) applicationContext.getBean("city2");
		c1.showcitytime();
		City c3 =(City) applicationContext.getBean("city3");
		c3.showcitytime();
		City c4 =(City) applicationContext.getBean("city4");
         c4.showcitytime();
		
	}

}
