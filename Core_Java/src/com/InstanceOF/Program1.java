package com.InstanceOF;

import java.util.Scanner;

class Rectangle{
	private float area;
	private float length;
	private float breadth;
	
	public Rectangle() {
		
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
	public void printRecord() {
		// TODO Auto-generated method stub
		System.out.println("Area : "+this.area);
	}
}

class Circle{
	private  float area;
	private float radius;
	
	public Circle() {
		
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
	public void printRecord() {
		// TODO Auto-generated method stub
		System.out.println("Area : "+this.area);
	}
	
}

public class Program1 {
	public static void main(String[] args) {
			Circle c = new Circle();
			c.acceptRecord();
			c.calculateArea();
			c.printRecord();
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.acceptRecord();
		rect.calculateArea();
		rect.printRecord();

	}

}
