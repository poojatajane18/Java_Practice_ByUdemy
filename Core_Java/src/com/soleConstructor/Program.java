package com.soleConstructor;

abstract class A {
	private int num1;
	private int num2;
	
	public A(int num1 , int num2){  //Sole constructor- this called from subclass constructor only - Implacitly called
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void printRecord() {
		System.out.println("Num1 : "+this.num1);
		System.out.println("Num2 : "+this.num2);
	}
}

class B extends A {
	private int num3;
	public B(int num1 , int num2 ,  int num3) {
		super(num1, num2);
		this.num3 = num3;
	}
	@Override
	public void printRecord() {
		// TODO Auto-generated method stub
		super.printRecord();
		System.out.println("Num3 : "+this.num3);
	}
	
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(10 , 20, 30 );  // first cl super class parameterless constructor then after move to the sub class constructor
		b.printRecord();
		
	}

}
