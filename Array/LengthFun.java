package com.Array;

public class LengthFun {
	private static void printRecord(int[] arr) {
		// TODO Auto-generated method stub
		for(int index = 0; index<arr.length; index++)
			System.out.print(arr[index]+" ");
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* initialize array
		int[] arr = new int[] {10,30,40,50};  //ok
		int arr1[] = {10,20,30};
		
		int arr[] = new int[3] {20,30,40}; //NOT OK  */
		
		int arr1[] = new int[] {10,20,30};
		LengthFun.printRecord(arr1);
		
		int arr2[] = new int[] {10,20,30,40,50};
		LengthFun.printRecord(arr2);
		
		int arr3[] = new int[] {10,20,30,7,90,4,23,9,000,45};
		LengthFun.printRecord(arr3);

	}

	

}
