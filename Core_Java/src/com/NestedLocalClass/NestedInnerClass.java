package com.NestedLocalClass;

class Outer{
	private int num1 = 10;  //ok
	private static int num2 = 20; //ok
	
	class Inner{
		private int num3 = 30;  //ok
		//private static int num4 = 40;  //Not-ok
		private final static int num4 = 40;  //ok
	}
	public void print() {
		System.out.println("Num1 : "+this.num1);
		System.out.println("Num2 : "+Outer.num2);
		Inner in = new Inner();
		System.out.println("Num3 : "+in.num3);
		System.out.println("Num4 : "+Inner.num4);
	}
}

public class NestedInnerClass {
	public static void main(String[] args) {
		Outer out = new Outer();
		 out.print();

	}

}
