package com.Example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast( 10 );
		list.addLast( 20 );
		list.addLast( 30 );
		for( int element : list )
		 System.out.println( element );

	}

}
