package com.yash.question4;

public class SetterMessage {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	void show() {
		System.out.println("messsage is :"+message);
	}
}
