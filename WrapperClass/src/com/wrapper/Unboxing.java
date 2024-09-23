package com.wrapper;

//Process of converting state of non primitive type into primitive type is called as unboxing.


public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer i = new Integer( "123" );
		Integer i = new Integer( 123 );
		int number = i.intValue( ); //UnBoxing
		System.out.println(number);
		
		String str = "456";
		int number1 = Integer.parseInt( str ); //UnBoxing
		System.out.println(number1);

	}

}
