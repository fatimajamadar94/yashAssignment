package com.yash.question2;

public class Triangle implements Shape{

	@Override
	public double area(double a, double b) {
		double areaOfTriangle=(a * b)/2;
		System.out.println("Area of triangle="+ areaOfTriangle);		
		return areaOfTriangle;
	}

}
