package com.NestedLocalClass;

class Outer2{
	 private int num1 = 10;
	 private static int num2 = 20;
	
	 class Inner2{
		 private int num3 = 30;
		 private final static int num4 = 40;
		 public void print( ) {
			 System.out.println("Num1 : "+num1); //OK
			 System.out.println("Num2 : "+num2); //OK
			 System.out.println("Num3 : "+this.num3);  //30
			 System.out.println("Num4 : "+Inner2.num4); //40
		 }
	 }
	}

public class NonStaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2.Inner2 in = new Outer2().new Inner2();
		in.print();


	}

}
