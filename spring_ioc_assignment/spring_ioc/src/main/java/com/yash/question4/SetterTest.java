package com.yash.question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.question3.ConstructorMessage;

public class SetterTest {
	
public static void main(String[] args) {
	 ApplicationContext appletContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SetterMessage s=(SetterMessage) appletContext.getBean("setter");
		s.show();
				
}

}
