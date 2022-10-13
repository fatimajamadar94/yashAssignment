package com.yash.question2;

public class Circle implements Shape {

	public double area(double a, double b) {

		double areaOfCircle=a*a*pi_value;
		System.out.println("Area of circle="+ areaOfCircle);		
		return areaOfCircle;
	}

}
