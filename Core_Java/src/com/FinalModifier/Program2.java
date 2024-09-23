package com.FinalModifier;
import java.util.Scanner;

public class Program2 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		final int number = 10; //Initialization
		number =20;  //Error : The final local variable number cannot be assigned.
		System.out.println("Number : "+number);
		*/
		
		System.out.println("Number : ");
		final int number = sc.nextInt();  //Initialization
		//number = 5;  //Error : The final local variable number cannot be assigned.
		System.out.println("Number : "+number);

	}

}
