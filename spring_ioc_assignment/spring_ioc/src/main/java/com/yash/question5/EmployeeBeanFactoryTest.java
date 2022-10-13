package com.yash.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.question2.ShapeAbstract;

public class EmployeeBeanFactoryTest {
public static void main(String[] args) {
	  ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
	  Employee emp = (Employee) objAC.getBean("clerk");
	  Employee emp1 = (Employee) objAC.getBean("manager");
	  Employee emp2 = (Employee) objAC.getBean("supervisor");

	  emp.showEmp();
	  emp1.showEmp();
	  emp2.showEmp();

}
}
