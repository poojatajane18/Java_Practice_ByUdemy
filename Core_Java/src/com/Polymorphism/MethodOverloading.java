package com.Polymorphism;

class Calculator {
	int sum(int a, int b) {
		return a+b;
	}
	double sum(double d, double e) {
		return d+e;
	}
	int sum(int a, int b, int c) {
		return a+b+c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println("Sum of two integer : "+cal.sum(5, 7));
		System.out.println("Sum of two integer : "+cal.sum(5, 7, 8));
		System.out.println("Sum of two Double : "+cal.sum(8.9, 7.6));
	}

}
