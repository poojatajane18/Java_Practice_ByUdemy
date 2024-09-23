package com.FinalClassMethod;

class A{
	public void f2() {
		System.out.println("A.f2()");
	}
	public final void f3() {
		System.out.println("A.f3()");
	}
}

class B extends A {
	//final method of super class is inherit into subclass we can not override
	/*@Override
	public final void f3() {  //Cannot override the final method from A
		System.out.println("A.f3()");
	}*/
	
	@Override
	public final void f2() {
		System.out.println("B.f2()");
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();  
		b.f3();//A.f3()
		b.f2();//B.f2()

	}

}
