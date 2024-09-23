package com.Enum;

import java.util.Scanner;

enum ArithmeticOperation{
	EXIT, SUM,SUB,MULTIPLICATION,DIVISION
}

class ArithmeticOperationTest{
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static int div(int num1, int num2) {
		return num1/num2;
	}
	public static void printRecord(int result) {
		System.out.println("Result : "+result);
	}
	
	private static Scanner sc = new Scanner(System.in);
	public static ArithmeticOperation menuList() {
		System.out.println("0.EXIT");
		System.out.println("1.SUM");
		System.out.println("2.SUB");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		//return ArithmeticOperation.values()[choice];
		
		ArithmeticOperation[] arr = ArithmeticOperation.values();
		return arr[choice];
	}
	
}

public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		ArithmeticOperation choice;
		while((choice = ArithmeticOperationTest.menuList()) !=null) {
			switch (choice) {
			case SUM:
				result = ArithmeticOperationTest.sum(100, 30);
				break;
			case SUB:
				result = ArithmeticOperationTest.sub(100, 20);
				break;
			case MULTIPLICATION:
				result = ArithmeticOperationTest.mul(100, 20);
				break;
			case DIVISION:
				result = ArithmeticOperationTest.div(100, 20);
				break;
			}
			ArithmeticOperationTest.printRecord(result);
		}

	}

}
