package com.yash.question2;

public class Sphere implements Shape{

	@Override
	public double area(double a, double b) {
		
		double areaOfSphere=4*a*a*pi_value;
		System.out.println("Area of sphere="+ areaOfSphere);
		return areaOfSphere;
	}

}
