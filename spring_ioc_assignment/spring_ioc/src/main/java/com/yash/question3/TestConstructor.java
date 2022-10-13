package com.yash.question3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
public static void main(String[] args) {
	  ApplicationContext appletContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	ConstructorMessage constructorMessage=(ConstructorMessage) appletContext.getBean("const");
	constructorMessage.show();
			
}
}
