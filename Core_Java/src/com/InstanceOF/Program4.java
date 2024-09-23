package com.InstanceOF;

import java.util.Scanner;

class Shape2{
	protected float area;
	public Shape2() {
		
	}
	public float getArea() {
		return this.area;
	}
	
}

class Rectangle3 extends Shape2{
	private float length;
	private float breadth;
	
	public Rectangle3() {
		
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

class Circle3 extends Shape2{
	private float radius;
	
	public Circle3() {
		
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));	
	}	
}
class RectangleTest{
	private Rectangle3 rect = new Rectangle3();
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Length : ");
		this.rect.setLength(sc.nextFloat());
		System.out.println("Breadth : ");
		this.rect.setBreadth(sc.nextFloat());
		
		this.rect.calculateArea();
	}
	public void printRecord() {
		System.out.println("Area : "+this.rect.getArea());
	}
}

class CircleTest{
	Circle3 c = new Circle3();
	
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Radius : ");
		this.c.setRadius(sc.nextFloat());
		
		this.c.calculateArea();
	}
	public void printRecord() {
		System.out.println("Area : "+this.c.getArea());
	}
}


public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleTest circle = new CircleTest();
		circle.acceptRecord();
		circle.printRecord();

	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		RectangleTest test = new RectangleTest();
		test.acceptRecord();
		test.printRecord();
	}

}
