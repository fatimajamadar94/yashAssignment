package com.yash.question2;

public class ShapeBean {
	
	public ShapeAbstract getTriangle() {
		return new Triangle();
	}
	public ShapeAbstract getRectangle() {
		return new Rectangle();
	}
	public ShapeAbstract getParallelogram() {
		return new Parallelogram();
	}
}
