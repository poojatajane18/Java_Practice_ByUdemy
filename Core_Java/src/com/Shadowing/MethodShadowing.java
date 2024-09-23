package com.Shadowing;

class A1{
	public void showRecord() {
		System.out.println("A.showRecord");
	}
	public void printRecord() {
		System.out.println("A.printRecord");
	}
}

class B1 extends A1{
	public void displayRecord() {
		System.out.println("B.displayRecord");
	}
	public void printRecord() {
		System.out.println("B.printRecord");
	}
}

public class MethodShadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1();
		b1.showRecord();  //A.showRecord
		b1.displayRecord(); //B.displayRecord
		b1.printRecord();  //B.printRecord ==> Shadowing
	}

}
