package com.Static;

class Test1{
	private int num1;
	private static int num2=10;
	public Test1(int num1) {
		super();
		this.num1 = num1;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void sumValue() {
		System.out.println("Value of NUM1 : "+this.num1);  //5
		System.out.println("Value of NUM2 : "+Test1.num2); //10
		num2 = num1+num2+5;   
		System.out.println("After adding value of NUM2 : "+Test1.num2); //20
	}
	public void subValue() {
		System.out.println("Value of NUM2 : "+Test1.num2);  //20
		num2 = num2 - num1;
		System.out.println("Afer substracting Value of NUM2 : "+Test1.num2); //15
	}
	public static void printRecord() {
		//System.out.println("NUM1 : "+this.num1); //Not OK 
		System.out.println("NUM2 : "+num2);   
		
	}
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1(5);
		t.sumValue();
		t.subValue();

	}

}
