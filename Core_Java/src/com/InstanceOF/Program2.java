package com.InstanceOF;

import java.util.Scanner;

class Shape{
	protected float area;
	public Shape() {
		
	}
	public void printRecord() {
		System.out.println("Area : "+this.area);
	}
	
}

class Rectangle1 extends Shape{
	private float length;
	private float breadth;
	
	public Rectangle1() {
		
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length : ");
		this.length = sc.nextFloat();
		System.out.println("Breadth : ");
		this.breadth = sc.nextFloat();
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = this.length * this.breadth;
		
	}
}

class Circle1 extends Shape{
	private float radius;
	
	public Circle1() {
		
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius : ");
		this.radius = sc.nextFloat();
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
		
	}
	
}

public class Program2 {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.acceptRecord();
		c.calculateArea();
		c.printRecord();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.acceptRecord();
		rect.calculateArea();
		rect.printRecord();

	}

}
