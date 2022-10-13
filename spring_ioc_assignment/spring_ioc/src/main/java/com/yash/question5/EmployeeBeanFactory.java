package com.yash.question5;

public class EmployeeBeanFactory {
	public Employee getClerk() {
		return new Clerk();
	}
	public Employee getManager() {
		return new Manager();
	}
	public Employee getSupervisor() {
		return new Supervisor();
	}
}
