package com.FinalModifier;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		final int number = 10;  //Initializaion
		// number = number +5;   //Error : The final local variable number cannot be assigned.
		System.out.println("Number : "+number);
		
		*/
		
		final int number;
		number=10; //Declaration
		//number = number+5;  //Error : The final local variable number may already have been assigned

		System.out.println("Number : "+number);

	}

}
