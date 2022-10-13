package com.yash.question4;

import java.util.Scanner;

public class Area {
	public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side");
        int firstSide=sc.nextInt();
        System.out.println("Enter the second side");
        int secondSide=sc.nextInt();
        System.out.println("Enter the third side");
        int thirdSide=sc.nextInt();
        int a = 0,b = 0;
        Area f=new Area();
        if(firstSide==secondSide) {
        	a=firstSide;
        	b=secondSide;
        	f.areaOfSquare(a, b);
        	f.areaOfRectangle(thirdSide, a);
        	
        }else if( secondSide==thirdSide) {
        	a=secondSide;
        	b=thirdSide;
        	f.areaOfSquare(a, b);
        	f.areaOfRectangle(a, firstSide);
        }else if(thirdSide==firstSide){
        	a=thirdSide;
        	b=firstSide;
        	f.areaOfSquare(a, b);
        	f.areaOfRectangle(a, secondSide);
        }else{
        	System.out.println("Two sides are not same");

        }
        	
        f.areaOfTriangle(firstSide, secondSide, thirdSide);


    }

	void areaOfSquare(int a, int b) {

		int area_square = a * b;
		System.out.println("the area of the square is if two side is same  " + area_square);

	}

	void areaOfRectangle(int x, int y) {
		int area_Rectangle = x * y;
		System.out.println("area of the Rectangle " + area_Rectangle);

	}

	void areaOfTriangle(int x, int y, int z) {
		int areaOfTriangle = (x * y * z) / 2;
		isValidTriangle(x, y, z);
		System.out.println("The area of the Triangle is " + areaOfTriangle + " " + isValidTriangle(x, y, z));
	}

	public static boolean isValidTriangle(int a, int b, int c) {
		return (a + b > c && b + c > a && c + a > b);
	}

}
