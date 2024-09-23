package com.NestedLocalClass;

interface Printable{
	 void print( );
}

public class MethodAnanymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printable p = new Printable() {
			 @Override
			 public void print() {
				 System.out.println("Hello World!!");
			 }
		};
		p.print();

	}

}
