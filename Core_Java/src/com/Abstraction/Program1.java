package com.Abstraction;

abstract class A1 {
	public abstract void f1();
	public abstract void f2();
	public abstract void f3();
}

abstract class E extends A1{ // Only support for sub-class method
	@Override
	public void f1() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void f2() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void f3() {
		// TODO Auto-generated method stub	
	}
}

class B1 extends E{
	//f1
	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("B1.f1()");
	}
}
class C1 extends E{
	//f2
	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("C1.f2()");
	}
}
class D1 extends E{
	//f3
	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("D1.f3()");
	}
}

class P extends E {
	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("P.f3()");
	}
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = null;
		
		a = new B1();
		a.f1();
		
		a = new C1();
		a.f2();
		
		a = new D1();
		a.f3();
		
		a = new P();
		a.f3();
		/*
		 *  B1.f1()
			C1.f2()
			D1.f3()
			P.f3()

		 */
		

	}

}
