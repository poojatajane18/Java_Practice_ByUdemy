package com.Array;
import java.util.Scanner;

public class AcceptRecord {

	private static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( int[] number ) {
		 System.out.print("Enter number : ");
		 number[ 0 ] = sc.nextInt();
	 }
	 private static void printRecord(int[] number) {
		 System.out.println("Number : "+number[ 0 ]);
	 }
	 public static void main(String[] args) {
		 int[] number = new int[ 1 ];
		 AcceptRecord.acceptRecord( number );
		 AcceptRecord.printRecord( number );
	 }
}
