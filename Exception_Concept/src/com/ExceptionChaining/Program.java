package com.ExceptionChaining;

class A extends Exception { } //Custom checked Exception
class B extends Exception { }
class C extends Exception { }
class D extends Exception { }

class X  {
	public void print() throws A,B,C{
		System.out.println("X.print");
	}
}

class Y extends X{
	@Override  //It should be same or subset
	public void print() throws A, B, C{  /*throws A, B, C,D*/ //Exception D is not compatible with throws clause in X.print()
		System.out.println("Y.print"); //It is applicable only unchecked exception
	}
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			X x =  new Y();
			x.print();
		} catch (A | B | C e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
