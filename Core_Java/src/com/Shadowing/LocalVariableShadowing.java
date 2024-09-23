package com.Shadowing;

class Complex{
	private int real;
	private int imag;
	
	public Complex(){
		this.real =10;
		this.imag = 20;
	}
	public void setReal(int real) {
		real = real ;  //Local variable assigned itself
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	@Override
	public String toString() {
		return this.real+" "+this.imag;
	}
}

public class LocalVariableShadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(); //10, 20
		c1.setReal(50);
		System.out.println(c1.toString());  // 10 20
	}

}
