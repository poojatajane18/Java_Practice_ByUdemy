package com.ExceptionChaining;

class E extends RuntimeException { } //Custom Unchecked Exception
class F extends RuntimeException { }
class G extends RuntimeException { }
class H extends RuntimeException { }

class X1  {
	public void print() throws E, F, G{
		System.out.println("X1.print");
	}
}

class Y1 extends X1{
	@Override
	public void print() throws E, F, G, H{  //It is applicable only unchecked exception
		System.out.println("Y1.print");
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			X1 x1 =  new Y1();
			x1.print();
		} catch (E | F | G ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
