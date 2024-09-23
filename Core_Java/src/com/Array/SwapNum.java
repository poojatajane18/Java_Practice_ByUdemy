package com.Array;

public class SwapNum {

	private static void swap(int[] arr ) {
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int[] arr = new int[ ] { x, y };
		
		SwapNum.swap( arr );
		x = arr[ 0 ];
		y = arr[ 1 ];
		System.out.println("X : "+x); //20
		System.out.println("Y : "+y); //10
		}
}
