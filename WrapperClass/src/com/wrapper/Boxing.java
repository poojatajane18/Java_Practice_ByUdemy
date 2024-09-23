package com.wrapper;

/*
 * Process of converting value of variable of primitive type into non primitive type is called as boxing.
 */

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		Integer i1 = new Integer( number ); //Boxing
		System.out.println(i1);
		
		int number1 = 123;
		Integer i2 = Integer.valueOf( number1 ); //Boxing
		System.out.println(i2);
		
		int number2 = 123;
		String s1 = Integer.toString( number2 ); //Boxing
		System.out.println(s1);
		
		int number3 = 123;
		String s2 = String.valueOf( number3 );
		System.out.println(s2);
		 
	}

}
