package com.Generics;

import java.util.Date;

/*
 * Generics is a Java language feature which helps developer to write generic code by passing data
		type as a agrument
 */


//Now class Box is called as parameterized type
class Box<T>{    //Here T is Type parameter
	private T reference;
	
	public T getReference() {
		return reference;
	}
	public void setReference(T reference) {
		this.reference = reference;
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Date> b1 = new Box<Date>(); //Here Date is called as Type argument
		b1.setReference(new Date());
		Date date = b1.getReference();
		System.out.println(date);    //Sun Aug 11 13:45:21 IST 2024
		

	}

}
