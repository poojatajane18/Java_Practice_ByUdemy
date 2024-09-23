package org.example.shape.lib;

public class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle() {
		
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = this.length * this.breadth;
		
	}

}
