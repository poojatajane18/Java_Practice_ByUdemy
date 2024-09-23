package com.InstanceOF;

import java.util.Scanner;

class Shape3{
	protected float area;
	public Shape3() {
		
	}
	public void calculateArea() {
		
	}
	public float getArea() {
		return this.area;
	}
	
}

class Rectangle4 extends Shape3{
	private float length;
	private float breadth;
	
	public Rectangle4() {
		
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

class Circle4 extends Shape3{
	private float radius;
	
	public Circle4() {
		
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
class ShapeTest{
	private static Scanner sc = new Scanner(System.in);
	
	private Shape3 shape;  //null
	public void setShape(Shape3 shape) {  //setter method Dependencies 
		this.shape = shape;
	}
	public void acceptRecord() {
		if(this.shape != null) {
			if(this.shape instanceof Rectangle4) {
				Rectangle4 rect = (Rectangle4) this.shape; //DownCasting
				System.out.println("Length : ");
				rect.setLength(sc.nextFloat());
				System.out.println("Breadth : ");
				rect.setBreadth(sc.nextFloat());
				
				//rect.calculateArea();
			}else {
				Circle4 circle = (Circle4) this.shape; //Downcasting
				System.out.println("Radius : ");
				circle.setRadius(sc.nextFloat());
				//circle.calculateArea();
			}
			this.shape.calculateArea(); //Runtime(instance) - dynamic method dispatch
			
		}
	}
	public void printRecord() {
		if(this.shape != null)
			System.out.println("Area : "+this.shape.getArea());
	}
}


public class Program5 {
	public static void main(String[] args) {
		ShapeTest test = new ShapeTest();
		test.setShape(null); //NullPointer Exception
		test.acceptRecord();
		test.printRecord();
	}

	public static void main2(String[] args) {
		ShapeTest test = new ShapeTest();
		test.setShape(new Circle4());
		test.acceptRecord();
		test.printRecord();
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest test = new ShapeTest();
		test.setShape(new Rectangle4());
		test.acceptRecord();
		test.printRecord();
	}

}
