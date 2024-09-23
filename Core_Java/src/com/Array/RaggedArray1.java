package com.Array;
import java.util.Scanner;

public class RaggedArray1 {
	
	private static Scanner sc = new Scanner(System.in);
	private static int[][] getArray() {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];
		arr[3] = new int[4];
		return arr;
	}
	private static void acceptRecord(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row =0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print("arr["+row+"]["+col+"] : ");
				arr[row][col] =sc.nextInt();
			}
		}
		
	}
	private static void printRecord(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row =0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) 
				System.out.print(arr[row][col]+" ");
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = RaggedArray1.getArray();
		RaggedArray1.acceptRecord(arr);
		RaggedArray1.printRecord(arr);

	}


}
