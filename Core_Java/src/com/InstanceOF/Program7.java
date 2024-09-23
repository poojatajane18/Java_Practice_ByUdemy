package com.InstanceOF;

import java.util.Scanner;

class Shape5{
	protected float area;
	public Shape5() {
		
	}
	public void calculateArea() {
		
	}
	public float getArea() {
		return this.area;
	}
	
}

class Rectangle6 extends Shape5{
	private float length;
	private float breadth;
	
	public Rectangle6() {
		
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

class Circle6 extends Shape5{
	private float radius;
	
	public Circle6() {
		
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
class ShapeFactory{  
	private ShapeFactory(){
		
	}
	public static Shape5 getReference(int choice) {
		Shape5 shape = null;
		switch(choice) {
		case 1:
			shape = new Rectangle6();
			break;
		case 2 : 
			shape = new Circle6();
			break;
		}
		return shape;
	}
}
class ShapeTest2{
	private static Scanner sc = new Scanner(System.in);
	
	private Shape5 shape;  //null
	public void setShape(Shape5 shape) {  //setter method Dependencies 
		this.shape = shape;
	}
	public void acceptRecord() {
		if(this.shape != null) {
			if(this.shape instanceof Rectangle6) {
				Rectangle6 rect = (Rectangle6) this.shape; //DownCasting
				System.out.println("Length : ");
				rect.setLength(sc.nextFloat());
				System.out.println("Breadth : ");
				rect.setBreadth(sc.nextFloat());
				
				//rect.calculateArea();
			}else {
				Circle6 circle = (Circle6) this.shape; //Downcasting
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
	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}
}


public class Program7 {
	public static void main(String[] args) {
		int choice;
		ShapeTest2 test = new ShapeTest2();
		while ((choice = ShapeTest2.menuList()) !=0 ) {
			Shape5 shape = ShapeFactory.getReference(choice);
			test.setShape(shape);
			test.acceptRecord();
			test.printRecord();
		}
	}

}
