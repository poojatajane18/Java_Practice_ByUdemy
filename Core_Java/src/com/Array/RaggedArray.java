package com.Array;

import java.util.Arrays;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ragged Array
		 * 
		 */
		
		/*Reference Declaration 
		int arr[][] = null;
		int[] arr1[] = null;
		int[][] arr2 = null;*/
		
		
		/*Instantiation
		int arr3[][] = new int[4][];
		arr3[0] = new int[3];
		arr3[1] = new int[5];
		arr3[2] = new int[2];
		arr3[3] = new int[4];
		//int arr5[][] = new int[][];  //NOT OK*/
		
		//Initialization
		int arr4[][] = new int[4][];
		arr4[0] = new int[] {1,2,3};
		arr4[1] = new int[] {4,5,6,7,8};
		arr4[2] = new int[] {9,10};
		arr4[3] = new int[] {11,12,13,14};
		
		/*System.out.println(Arrays.toString(arr4[0]));  //[1, 2, 3]
		System.out.println(Arrays.toString(arr4[1]));  //[4, 5, 6, 7, 8]
		System.out.println(Arrays.toString(arr4[2]));  //[9, 10]
		System.out.println(Arrays.toString(arr4[3]));  //[11, 12, 13, 14]
		*/
		
		//System.out.println(Arrays.deepToString(arr4));  //[[1, 2, 3], [4, 5, 6, 7, 8], [9, 10], [11, 12, 13, 14]]
		
		//System.out.println(arr4.toString());  //[[I@3feba861
		
		for(int index=0; index<arr4.length; index++)
			System.out.println(Arrays.toString(arr4[index]));
		
		//using foreach loop
		System.out.println("Using for Each loop : ");
		for(int[] row : arr4) {
			for(int col: row)
				System.out.print(col+" ");
			System.out.println();
		}
		
	}

}
