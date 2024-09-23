package com.Interface;

interface P {
	void f1();
	void f3();
}

interface Q {
	void f2();
	void f3();
}

class R implements P, Q {

	@Override
	public void f1() {
		System.out.println("R.f1");
	}
	@Override
	public void f2() {
		System.out.println("R.f2");
	}
	
	@Override
	public void f3() {
		System.out.println("R.f3");
	}
	
}

public class InterfaceMethod1 {

	public static void main(String[] args) {
		P p = new R();
		p.f1();  //R.f1
		p.f3();  //R.f3
		
		Q q = new R();
		q.f2();  //R.f2
		q.f3();  //R.f3
	}

}
