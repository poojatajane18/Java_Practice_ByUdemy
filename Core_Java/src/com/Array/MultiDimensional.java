package com.Array;
import java.util.Scanner;

public class MultiDimensional {
	private static Scanner sc = new Scanner(System.in);
	private static void acceptRecord(int[][] arr) {
		for (int row = 0; row < arr.length; ++row) {
			for (int col = 0; col < arr[row].length; ++col) {
				System.out.print("Enter number : ");
				arr[row][col] = sc.nextInt();
			}
		}
	 }
	private static void printRecord(int[][] arr) {
		for (int row = 0; row < arr.length; ++row) {
			for (int col = 0; col < arr[row].length; ++col) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		MultiDimensional.acceptRecord(arr);
		MultiDimensional.printRecord(arr);
	}

}
