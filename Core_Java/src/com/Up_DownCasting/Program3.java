package com.Up_DownCasting;

class P{
	public void print() {
		System.out.println("P.print");
	}
	public void display() {
		System.out.println("P.display");
	}
}

class Q extends P {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Q.print");
	}
	public void show() {
		System.out.println("Q.show");
	}
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p = new P();
		p.print();  //P.print
		
		Q q = new Q();
		q.print();  //Q.print => Due to shadowing preference will be given to B.print
		
		P a2 = new Q(); //OK: Upcasting
		a2.print();
		a2.display();
		//a2.show();  //Compiler Error
		
		//Q q1 = new P();  //Compiler Error => Type mismatch: cannot convert from P to Q
		//q1.print();
		

	}

}
