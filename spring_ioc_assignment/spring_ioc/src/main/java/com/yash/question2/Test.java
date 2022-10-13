package com.yash.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	{
		  ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		  ShapeAbstract shape = (ShapeAbstract) objAC.getBean("triangle");
		  ShapeAbstract shape1 = (ShapeAbstract) objAC.getBean("rectangle");
		  ShapeAbstract shape2 = (ShapeAbstract) objAC.getBean("parralellogram");

		  shape.draw();
		  shape1.draw();
		  shape2.draw();
	  }
	}
}
