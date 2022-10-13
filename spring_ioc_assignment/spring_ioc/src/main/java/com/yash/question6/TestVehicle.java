package com.yash.question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVehicle {
public static void main(String[] args) {
	  ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
//	  Engine engine=(Engine) objAC.getBean("engineTwoWheeler");
//	  engine.engineDetails();
	  Vehicle vehicle=(Vehicle) objAC.getBean("bike");
	  vehicle.showVehicle();
System.out.println("***************next type*****************");
	  Vehicle vehicle1=(Vehicle) objAC.getBean("car");
	  vehicle1.showVehicle();

}
}
