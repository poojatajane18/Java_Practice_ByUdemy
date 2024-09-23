package com.GenUsingObjectClass;

//Using java.lang.Object class, we can write generic code but we can not write type-safe generic code.

import java.util.Date;

public class Box {
	private Object reference;
	public Object getReference() {
		return reference;
	}
	public void setReference(Object reference) {
		this.reference = reference;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		b1.setReference(new Date());
		Date date = (Date) b1.getReference(); // Downcasting
		String str = (String) b1.getReference(); //Downcasting => classCastException
		
		//If we want to write type-safe generic code then we should use generics.

	}

}
