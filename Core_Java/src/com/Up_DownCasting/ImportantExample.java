package com.Up_DownCasting;

class A3{
	public void print() {
		System.out.println("A.print");
	}
	public void display() {
		System.out.println("A.display");
	}
}
class B3 extends A3 {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("B.print");
	}
	public void show() {
		System.out.println("B.show");
	}
	
}

public class ImportantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a = new A3();
		a.print();     //A.print
		a.display();  //A.display
		
		B3 b = new B3();
		b.print();    //B.print => Due to shadowing preference will be given to B.print
		
		A3 a1 = new B3();  //Upcasting
		a1.print(); //B.print
		a1.display();//A.display
		//a1.show();   // => Compiler error
		
		//B3 b2 = new A3(); //Compiler error
		 //b2.print( );
		
	}

}
