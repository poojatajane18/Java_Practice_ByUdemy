package com.Static;

class X{
	private int num1;
	private int num2;
	private static int count=500;
	public X(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void printRecord() {
		System.out.println(this.num1+" "+this.num2+" "+X.count);
	}
	
	
	
	 
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x1 = new X(10,20);
		X x2 = new X(30,40);
		X x3 = new X(50,60);
		
		x1.printRecord();
		x2.printRecord();
		x3.printRecord();
		
		

	}

}
