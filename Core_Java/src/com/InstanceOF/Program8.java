package com.InstanceOF;

import java.util.Scanner;

class Shape6{
	protected float area;
	public Shape6() {
		
	}
	public void calculateArea() {
		
	}
	public float getArea() {
		return this.area;
	}
	
}

class Rectangle7 extends Shape6{
	private float length;
	private float breadth;
	
	public Rectangle7() {
		
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

class Circle7 extends Shape6{
	private float radius;
	
	public Circle7() {
		
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
enum ShapeType{
	EXIT, RECTANGLE, CIRCLE
}
class ShapeFactory1{  //Object creation hide is called as factory method 
	private ShapeFactory1(){  
		
	}
	public static Shape6 getReference(ShapeType choice) {
		Shape6 shape = null;
		switch(choice) {
		case RECTANGLE:
			shape = new Rectangle7();
			break;
		case CIRCLE: 
			shape = new Circle7();
			break;
		}
		return shape;
	}
}
class ShapeTest3{
	private static Scanner sc = new Scanner(System.in);
	
	private Shape6 shape;  //null
	public void setShape(Shape6 shape) {  //setter method Dependencies 
		this.shape = shape;
	}
	public void acceptRecord() {
		if(this.shape != null) {
			if(this.shape instanceof Rectangle7) {
				Rectangle7 rect = (Rectangle7) this.shape; //DownCasting
				System.out.println("Length : ");
				rect.setLength(sc.nextFloat());
				System.out.println("Breadth : ");
				rect.setBreadth(sc.nextFloat());
				
				//rect.calculateArea();
			}else {
				Circle7 circle = (Circle7) this.shape; //Downcasting
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
	public static ShapeType menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("Enter choice : ");
		return ShapeType.values()[sc.nextInt()];
	}
}


public class Program8 {
	public static void main(String[] args) {
		ShapeType choice;
		ShapeTest3 test = new ShapeTest3();
		while ((choice = ShapeTest3.menuList()) != ShapeType.EXIT ) {
			Shape6 shape = ShapeFactory1.getReference(choice);
			test.setShape(shape);
			test.acceptRecord();
			test.printRecord();
		}
	}

}
