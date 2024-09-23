package com.NestedLocalClass;

class Outer3{
	 private int num1 = 10;
	 private static int num2 = 20;
	 
	 static class Inner3{
	 private int num3 = 30; //OK
	 private static int num4 = 40; //OK
	 }
	 public void print( ) {
	 System.out.println("Num1 : "+this.num1);
	 System.out.println("Num2 : "+Outer3.num2);
	 Inner3 in = new Inner3();
	 System.out.println("Num3 : "+in.num3);
	 System.out.println("Num4 : "+Inner3.num4);
	 }
}

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 out = new Outer3();
		out.print();


	}

}
