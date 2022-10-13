package com.yash.question6;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {
private String engineName;
private  String  engineType;
private String enginePower;
public String getEngineName() {
	return engineName;
}
public void setEngineName(String engineName) {
	this.engineName = engineName;
}
public String getEngineType() {
	return engineType;
}
public void setEngineType(String engineType) {
	this.engineType = engineType;
}
public String getEnginePower() {
	return enginePower;
}
public void setEnginePower(String enginePower) {
	this.enginePower = enginePower;
}
public Engine(String engineName, String engineType, String enginePower) {
	super();
	this.engineName = engineName;
	this.engineType = engineType;
	this.enginePower = enginePower;
}

public void engineDetails() {
	System.out.println(engineName);
System.out.println("Engine [engineName=" + engineName + ", engineType=" + engineType + ", enginePower=" + enginePower + "]");}

}
