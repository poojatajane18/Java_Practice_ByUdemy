package com.ExceptionChaining;

// Checked exception list in sub class method should be same or it should be sub set.

class X2 extends Exception{}
class Y2 extends Exception{}
class Z extends Exception{}
class W extends Exception{}

class Super{
	public void printRecord() throws X2, Y2, Z{
		System.out.println("Super.printRecord()");
	}
}

class Sub extends Super{
	@Override
	public void printRecord() throws X2, Y2, Z{
		System.out.println("Sub.printRecord()");
	}
}
public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Sub b = new Sub();
			b.printRecord();
		} catch (X2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Y2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Z e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
