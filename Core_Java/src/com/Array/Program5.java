package com.Array;

public class Program5 {

	private static void swap(int a, int b) {
		 int temp = a;
		 a = b;
		 b = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		Program5.swap( x, y );
		System.out.println("X : "+x); //10
		System.out.println("Y : "+y); //20


	}

}
