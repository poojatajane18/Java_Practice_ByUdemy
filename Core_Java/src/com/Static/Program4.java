package com.Static;

class Complex {
	private int real;
	private int imag;
	/*
	public Complex() {
		//If constructor is public then we can create instance of the class inside method of same class as well as method of different class.
		System.out.println("Inside Constructor.");
		this.real = 10;
		this.imag =20;
	}*/
	
	private Complex() {
		System.out.println("Inside Constructor.");
		this.real = 10;
		this.imag =20;
	}
	
	
	public static void test() {
		Complex c1 = new Complex(); //ok
		System.out.println(c1.real+" "+c1.imag);
	}
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Complex c2 = new Complex(); //Constructor is Private then ERROR : The constructor Complex() is not visible
		Complex.test();

	}

}
