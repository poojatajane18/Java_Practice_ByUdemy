package com.Array;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Multi- Dimensional Array
		 * 
		 */
		
		//REFERENCE Declaration
		int[][] arr = null;   //ok
		int[] arr1[] = null; //ok
		int arr2[][] = null;  //ok
		
		
		//INSTANTIATION 
		int arr3[][] = new int[4][3];
		
		//INITIALIZE Multidimensional array
		int[][] arr4 = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; //ok
		
		//int[][] arr5 = new int[3][3] {{1,2,3},{4,5,6},{7,8,9}};  //NOT OK
		
		int arr5[][] = {{1,2,3},{4,5,6},{7,8,9}};

	}

}
