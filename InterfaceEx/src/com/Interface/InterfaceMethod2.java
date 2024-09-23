package com.Interface;

interface Printable1 {
	void f1();
	void f2();
	void f3();
	//void f4();
}

abstract class AbstractPrintable implements Printable1{
	@Override
	public void f1() {}
	@Override
	public void f2() {}
	@Override
	public void f3() {}
}

class X extends AbstractPrintable{
	@Override
	public void f1() {
		System.out.println("X.f1");
	}
}

class Y extends AbstractPrintable {
	@Override
	public void f2() {
		System.out.println("Y.f2");
	}
}

class Z extends AbstractPrintable {
	@Override
	public void f3() {
		System.out.println("Z.f3");
	}
}

public class InterfaceMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable1 p1 = null;
		
		p1 = new X();
		p1.f1(); //X.f1
		
		p1 = new Y();
		p1.f2(); //Y.f2
		
		p1 = new Z();
		p1.f3();  //Z.f3
	}

}
