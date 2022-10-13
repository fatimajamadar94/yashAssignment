package com.yash.question3;

public class ConstructorMessage {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}
	void show() {
		System.out.println("message is:"+message);
	}

}
