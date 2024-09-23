package org.example.test;
import java.util.Scanner;

import org.example.shape.lib.Rectangle;
import org.example.shape.lib.Shape;
import org.example.shape.lib.ShapeType;
import org.example.shape.lib.Circle;

public class ShapeTest {
		private static Scanner sc = new Scanner(System.in);
		
		private Shape shape;  //null
		public void setShape(Shape shape) {  //setter method Dependencies 
			this.shape = shape;
		}
		public void acceptRecord() {
			if(this.shape != null) {
				if(this.shape instanceof Rectangle) {
					Rectangle rect = (Rectangle) this.shape; //DownCasting
					System.out.println("Length : ");
					rect.setLength(sc.nextFloat());
					System.out.println("Breadth : ");
					rect.setBreadth(sc.nextFloat());
					
					//rect.calculateArea();
				}else {
					Circle circle = (Circle) this.shape; //Downcasting
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
