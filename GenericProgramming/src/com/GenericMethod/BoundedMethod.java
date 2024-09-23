package com.GenericMethod;

public class BoundedMethod {
	public static <T extends Number> void print( T value) {
		 System.out.println( value );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BoundedMethod.print( true ); //Not OK
		BoundedMethod.print( 123 );
		 //BoundedMethod.print( 'A' );//Not OK
		BoundedMethod.print( 1234567 );
		BoundedMethod.print( 3.142f );
		BoundedMethod.print( 123.4567d );
		 //BoundedMethod.print( "Good Morning!!" );//Not OK
		 //BoundedMethod.print( new Date() );//Not OK


	}

}
