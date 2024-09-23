package com.Up_DownCasting;

class A2{
	public void print () {
		System.out.println("A.print");
	}
}

class B2 extends A2{
	public void f1() {
		A2 a = new A2();  //Instance Dependency
		a.print();
	}
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b = new B2();
		b.f1();  //A.print

	}

}
