package com.Static;

class Super1{
	public void printRecord() {
		System.out.println("Super.printRecord()");
	}
}

class Sub1 extends Super1{
	@Override
	public void printRecord() {  //Overrided method
		System.out.println("Sub.printRecord()");
	}
}

public class StaticMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super1 s1 = new Super1();
		//s1.printRecord();
		
		Sub1 s2 = new Sub1();
		s2.printRecord();   //Due to method shadowing
 //method hiding
	}

}
