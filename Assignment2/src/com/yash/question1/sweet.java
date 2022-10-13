package com.yash.question1;

public class sweet extends Fruit {
	String[] fruitInfo = new String[9];
	String sourt;

	public sweet(String fruitname, String fruitcolor, String[] fruitinfo, String sourtest) {
		super(fruitname, fruitcolor);
		this.fruitInfo = fruitinfo;
		this.sourt = sourtest;
	}

	public void display(sweet sf)
	{
		System.out.println("***** SourFruits Details** ***");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("**Nutrition summary**");
		       for(String s:sf.fruitInfo)
		       {
		    	   System.out.print(s +" \n");
		       }
		
		System.out.println("It has "+sf.sourt+" sugar so it is SourFruit");
		System.out.println("=============****=============");
	}
