package com.Throwable;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Integer.MAX_VALUE);   //2147483647
		/*int[] arr = new int[Integer.MAX_VALUE];
		System.out.println(Arrays.toString(arr));  //java.lang.OutOfMemoryError:*/
		
		/*System.out.println("Hi");
		main(null); */ //java.lang.StackOverflowError
		 
		try {
			int[] arr = new int[Integer.MAX_VALUE];
			System.out.println(Arrays.toString(arr));
			
		}catch(OutOfMemoryError error) {
			System.out.println(error.getMessage());   //Requested array size exceeds VM limit
		}
	}

}
