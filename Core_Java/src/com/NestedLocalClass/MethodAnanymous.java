package com.NestedLocalClass;

abstract class Shape{
	 protected double area;
	 public double getArea() {
		 return area;
	 }
	 public abstract void calculateArea();
	}

public class MethodAnanymous {

	public static void main(String[] args) {
		Shape sh = new Shape() {
			 private double radius = 10.5;
			 @Override
			 public void calculateArea() {
				 this.area = Math.PI * Math.pow(radius, 2);
			 }
		};
		sh.calculateArea();
		System.out.println("Area : "+sh.getArea());

	}

}
