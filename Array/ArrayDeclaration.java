package com.Array;
import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Reference Declaration
		int arr[];
		int[] arr1;
		
		//int [arr];  //NOT OK
		int[] arr2 = null;
		System.out.println(arr2);
		
		
		/*Array Initialization 
		new int[3];  
		new boolean[3];
		*/
		
		//Array instance with reference
		int arr4[]=null;
		arr4 = new int[3];
		
		int array[] = new int[3];
		
		// int num[] = new int[-3];  //NegativeArraySizeException
		//System.out.println(num);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int array1[] = new int[size];

		
		
		
		

	}

}
