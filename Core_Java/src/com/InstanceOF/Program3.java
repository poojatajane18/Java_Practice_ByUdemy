package com.InstanceOF;

import java.util.Scanner;

class Shape1{
	protected float area;
	public Shape1() {
		
	}
	public float getArea() {
		return this.area;
	}
	
}

class Rectangle2 extends Shape1{
	private float length;
	private float breadth;
	
	public Rectangle2() {
		
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = this.length * this.breadth;
		
	}
}

class Circle2 extends Shape1{
	private float radius;
	
	public Circle2() {
		
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
		
	}
	
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c = new Circle2();
		c.setRadius(10.0f);
		c.calculateArea();
		System.out.println("Area : "+c.getArea());


	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2 rect = new Rectangle2();
		rect.setLength(10.5f);
		rect.setBreadth(20.1f);
		rect.calculateArea();
		System.out.println("Area : "+rect.getArea());
	}

}
