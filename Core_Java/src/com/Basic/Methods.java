package com.Basic;

import java.util.Scanner;  

public class Methods {
	public static void printHello() {
		System.out.println("Hello World");
	}
	
	public static int calculateSum(int a, int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two values");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int sum = calculateSum(a, b);
		System.out.println("Sum is "+sum);
		printHello();
	}

}
