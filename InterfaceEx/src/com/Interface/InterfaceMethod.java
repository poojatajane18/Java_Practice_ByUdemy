package com.Interface;

interface A1{
	void f1();
}

interface B1{
	void f2();
}

interface C1 extends A1, B1{
	void f3();
}
class D implements C1{
	@Override
	public void f1() {
	System.out.println("D.f1");
	}
	@Override
	public void f2() {
	System.out.println("D.f2");
	}
	@Override
	public void f3() {
		System.out.println("D.f3");
	}
}

public class InterfaceMethod {

	public static void main(String[] args) {
		D d = new D();
		d.f1();//OK - D.f1
		
		A1 a = new D();
		a.f1();//OK - D.f1
		
		B1 b = new D();
		b.f2();//OK - D.f2
		
		C1 c = new D();
		c.f1(); //OK - D.f1
		c.f2(); //OK - D.f2
		c.f3(); //Ok - D.f3

	}

}
