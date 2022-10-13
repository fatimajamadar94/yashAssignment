package com.yash.question2;

import java.util.Scanner;

public class AreaCalculate {
	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
	         System.out.println("Select the shape :");
	         System.out.println("1.circle " );
	         System.out.println("2.Traingle ");
	         System.out.println("3.Sphere :");
	         System.out.println("Please enter any of the above option: ");
	         int num = sc.nextInt();
	         double radius;
	         Double b;
	         switch(num)
	         {
	            case 1: System.out.println("Please enter radius of circle: ");
	             radius = sc.nextDouble();
	             b=0.0;
		         Circle circle=new Circle();
		         circle.area(radius, b);
	            break;
	            case 2: System.out.println("Please enter base and height of triangle: ");
	            double base = sc.nextDouble();
	            double height = sc.nextDouble();
	            Triangle triangle=new Triangle();
		          triangle.area(base, height);
	            break;
	            case 3: System.out.println("Please enter radius of Sphere: ");
	           radius=sc.nextDouble(); 
	            Sphere sphere=new Sphere();
	             b=0.0;
		          sphere.area(radius, b);
	            break;
	            default:System.exit(0);
	         }
	         sc.close();
	      }
	          
	         
	}


