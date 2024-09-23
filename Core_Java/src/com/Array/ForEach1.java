package com.Array;

public class ForEach1 {
	
	private static void printRecord(int[] arr) {
		// TODO Auto-generated method stub
		if(arr !=null) {
			for(int element : arr)
				System.out.print(element+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {10,30,50};
		ForEach1.printRecord(arr);

	}

}
