package com.NestedLocalClass;

class Outer1{
	 private int num1 = 10;
	 
	 class Inner1{
		 private int num1 = 20;
		 public void print( ) {
			 int num1 = 30;
			 System.out.println("Num1 : "+Outer1.this.num1); //10
			 System.out.println("Num1 : "+this.num1); //20
			 System.out.println("Num1 : "+num1); //30
	 }
	 }
	}


public class Nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1.Inner1 in = new Outer1().new Inner1();
		in.print();
	}

}
