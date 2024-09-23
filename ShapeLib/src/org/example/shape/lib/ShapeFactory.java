package org.example.shape.lib;

public class ShapeFactory {
	private ShapeFactory(){  
		
	}
	public static Shape getReference(ShapeType choice) {
		Shape shape = null;
		switch(choice) {
		case RECTANGLE:return new Rectangle();
		case CIRCLE: return new Circle();
		}
		return null;
	}

}
