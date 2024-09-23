package com.InstanceOF;

import java.util.Scanner;

class Shape4{
	protected float area;
	public Shape4() {
		
	}
	public void calculateArea() {
		
	}
	public float getArea() {
		return this.area;
	}
	
}

class Rectangle5 extends Shape4{
	private float length;
	private float breadth;
	
	public Rectangle5() {
		
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

class Circle5 extends Shape4{
	private float radius;
	
	public Circle5() {
		
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
class ShapeTest1{
	private static Scanner sc = new Scanner(System.in);
	
	private Shape4 shape;  //null
	public void setShape(Shape4 shape) {  //setter method Dependencies 
		this.shape = shape;
	}
	public void acceptRecord() {
		if(this.shape != null) {
			if(this.shape instanceof Rectangle5) {
				Rectangle5 rect = (Rectangle5) this.shape; //DownCasting
				System.out.println("Length : ");
				rect.setLength(sc.nextFloat());
				System.out.println("Breadth : ");
				rect.setBreadth(sc.nextFloat());
				
				//rect.calculateArea();
			}else {
				Circle5 circle = (Circle5) this.shape; //Downcasting
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


public class Program6 {
	public static void main(String[] args) {
		int choice;
		ShapeTest1 test = new ShapeTest1();
		while ((choice = ShapeTest1.menuList()) !=0 ) {
			switch(choice) {
			case 1 :
				test.setShape(new Rectangle5());
				break;
			case 2 :
				test.setShape(new Circle5());
				break;
			}
			test.acceptRecord();
			test.printRecord();
		}
	}
	public static void main3(String[] args) {
		ShapeTest1 test = new ShapeTest1();
		test.setShape(null); //NullPointer Exception
		test.acceptRecord();
		test.printRecord();
	}

	public static void main2(String[] args) {
		ShapeTest1 test = new ShapeTest1();
		test.setShape(new Circle5());
		test.acceptRecord();
		test.printRecord();
	}
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest1 test = new ShapeTest1();
		test.setShape(new Rectangle5());
		test.acceptRecord();
		test.printRecord();
	}

}
