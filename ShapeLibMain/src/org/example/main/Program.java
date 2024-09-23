package org.example.main;


import org.example.shape.lib.Shape;
import org.example.shape.lib.ShapeFactory;
import org.example.shape.lib.ShapeType;
import org.example.test.ShapeTest;


public class Program {
	public static void main(String[] args) {
		ShapeType choice;
		ShapeTest test = new ShapeTest();
		while ((choice = ShapeTest.menuList()) != ShapeType.EXIT ) {
			Shape shape = ShapeFactory.getReference(choice);
			test.setShape(shape);
			test.acceptRecord();
			test.printRecord();
		}
	}

}
