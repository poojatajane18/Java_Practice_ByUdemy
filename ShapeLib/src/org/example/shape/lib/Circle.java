package org.example.shape.lib;

public class Circle extends Shape{
	private float radius;
	
	public Circle() {
		
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));	
	}	

}
