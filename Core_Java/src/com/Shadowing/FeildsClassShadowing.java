package com.Shadowing;

class A {
	int num1 = 10;
	int num3 = 30;
}

class B extends A {
	int num2 = 20;
	int num3 = 40;
	
	public void printRecord() { 
		System.out.println("Num1 : "+num1);  //10
		System.out.println("Num1 : "+this.num1);  //10
		System.out.println("Num1 : "+super.num1);  //10
		
		System.out.println("Num2 : "+num2);  //20
		System.out.println("Num2 : "+this.num2);  //20
		
		System.out.println("Num3 : "+num3);  //40  Shadowing : Preference to subclass 
		System.out.println("Num3 : "+this.num3); //40 Shadowing
		System.out.println("Num3 : "+super.num3); //30
	}
}

public class FeildsClassShadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.printRecord();

	}

}
