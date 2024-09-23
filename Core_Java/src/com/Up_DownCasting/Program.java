package com.Up_DownCasting;

/* Overriden method - Parameter should be same
	- method return type same & wider than
* */

class A{
	public void print (double number) {
		System.out.println("A.print");
	}
}

class B extends A{
	/*public void prin(int number) {
		System.out.println("B.print");
	}*/
	
	public void print(double number) {
		System.out.println("B.print");
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();  //Upcasting
		a.print(8.9);   //B.print

	}

}
