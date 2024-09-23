package com.wrapper;

//If unboxing is done implicitly then it is called as auto-unboxing

public class AutoUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = new Integer(123);
		 int number = i; //Auto-Unboxing
		 //int number = i.intValue();
		 System.out.println("Number : "+number);
	}

}
