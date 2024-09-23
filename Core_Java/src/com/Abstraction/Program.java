package com.Abstraction;

abstract class A{
	public abstract void f1();
	public void f2() {
		System.out.println("A.f2()");
	}
	public final void f3() {
		System.out.println("A.f3()");
	}
}

class B extends A {
	@Override
	public final void f2() {
		System.out.println("B.f2()");
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("B.f1()");
		
	}
}

final class C extends B{
	@Override
	public final void f1() {
		// TODO Auto-generated method stub
		System.out.println("C.f1()");
	}
}




/*  ----If super class contains abstract method then sub class must override it 
 * otherwise sub class will be considered as abstract.---
	
abstract class A{
	public abstract void f1();
}

class B extends A {
	@Override
	public void f1() {
		// TODO Auto-generated method stub	
	}
		// OR 
abstract class B extends A {
	}
}
*/


public class Program {
	public static void main(String[] args) {
		A a  = null;  //OK
	 // new A();     //NOT OK - Cannot instantiate the type A
		
		C c = new C(); //If we create constructor privete we can not call
		c.f1();
		c.f2();
		c.f3();
	}

}
