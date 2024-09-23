package com.Up_DownCasting;

class A1{
	public Number print() {
		System.out.println("A.print");
		Number number = new Integer(0);
		return number;
	}
	
}

class B1 extends A1 {
	/*public Number print() {
		System.out.println("B.print");
		Number number = new Integer(0);
		return number;
	}*/
	public Integer print() {
		System.out.println("B.print");
		Integer number = new Integer(0);
		return number;
	}
	
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new B1();  //Upcasting
		a.print();  //B.print

	}

}
