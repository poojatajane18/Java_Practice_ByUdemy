package com.Array;

import java.util.Scanner;

public class AcceptPrint {
	static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[] arr) {
		// TODO Auto-generated method stub
		if(arr !=null) {
			for(int index =0; index<arr.length; index++) {
				System.out.println("Enter element : ");
				arr[index]=sc.nextInt();
			}
		}
		
	}
	
	private static void printRecord(int[] arr) {
		// TODO Auto-generated method stub
		if(arr !=null) {
			for(int index=0; index<arr.length; index++)
				System.out.print(arr[index]+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[3];
		AcceptPrint.acceptRecord(arr1);
		AcceptPrint.printRecord(arr1);

	}

}
