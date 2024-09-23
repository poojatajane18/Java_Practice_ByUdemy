package com.GenericMethod;

import java.util.Date;

public class MethodUsingGenerics {
	public static <T> void print (T value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodUsingGenerics.print( true );
		MethodUsingGenerics.print( 123 );
		MethodUsingGenerics.print( 'A' );
		MethodUsingGenerics.print( 1234567 );
		MethodUsingGenerics.print( 3.142f );
		MethodUsingGenerics.print( 123.4567d );
		MethodUsingGenerics.print( "Good Morning!!" );
		MethodUsingGenerics.print( new Date() );
	}

}
