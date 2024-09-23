package com.NestedLocalClass;

public class MethodLocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Complex{
			private int real = 10 ;
			private int imag = 20 ;
			
			public Complex() {
				this(0,0);
			}
			
			public Complex(int real , int imag) {
				this.real = real;
				this.imag = imag;
			}
			
			@Override
			public String toString() {
				return this.real+" "+this.imag;
			}
		}
		Complex c = new Complex(3,5);
		System.out.println(c.toString());

	}

}
