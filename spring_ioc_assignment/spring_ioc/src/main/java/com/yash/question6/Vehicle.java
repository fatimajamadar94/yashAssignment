package com.yash.question6;

public class Vehicle {

	private String vehicleName;
	private String vehicletype;
	private String milege;
	private double price;
	private Engine engine;
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public String getMilege() {
		return milege;
	}
	public void setMilege(String milege) {
		this.milege = milege;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Vehicle(String vehicleName, String vehicletype, String milege, double price, Engine engine) {
		super();
		this.vehicleName = vehicleName;
		this.vehicletype = vehicletype;
		this.milege = milege;
		this.price = price;
		this.engine = engine;
	}
	void showVehicle() {
		System.out.println("features of vehicle "+vehicletype);
		System.out.println("vehicle name :"+vehicleName);
		System.out.println("price of "+vehicleName+ " is :"+price);
		System.out.println("milege of" +vehicleName +" is :"+ milege);
		System.out.println("Engine details");
		engine.engineDetails();
		
		
	}

}
