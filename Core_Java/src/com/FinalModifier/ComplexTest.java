package com.FinalModifier;

class Complex {
	private int real;
	private int imag;
	
	public Complex() {
		this(10,20);
	}
	public Complex(int real , int imag) {
		this.real = real;
		this.imag = imag;
	}
	public int getReal() {
		return this.real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	
	public int getImag() {
		return this.imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	
}

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Complex c1 = new Complex(40,50);
		System.out.println("Real Number : "+c1.getReal());
		System.out.println("Imag Number : "+c1.getImag());
		
		//c1 = new Complex(100,200); //The final local variable c1 cannot be assigned. 

	}

}
