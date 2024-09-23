package com.Array;

public class Program3 {
	
	public static void main(String[] args) {
		 int[] arr = new int[ ] { 10, 20, 30 };
		 int element = arr[ arr.length ];
		//ArrayIndexOutOfBoundsException
		 System.out.println( element );
	}
	
	public static void main2(String[] args) {
		 int[] arr = new int[ ] { 10, 20, 30 };
		 int element = arr[ 3 ]; //ArrayIndexOutOfBoundsException
		 System.out.println( element );
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[ ] { 10, 20, 30 };
		 int element = arr[ -1 ]; //ArrayIndexOutOfBoundsException
		 System.out.println( element );

	}

}
