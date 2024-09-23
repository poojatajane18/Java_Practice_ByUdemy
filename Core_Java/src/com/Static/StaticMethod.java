package com.Static;
class Super{
	public static void showRecord() {
		System.out.println("Super.showRecord()");
	}
}

class Sub extends Super{
	/*@Override
	public static void showRecord() { //Compiler Error : Static method cannot be Override
		System.out.println("Sub.showRecord()");
	}*/
	
	public static void showRecord() { 
		System.out.println("Sub.showRecord()");
	}
	
}

public class StaticMethod {
	public static void main(String[] args) {
		Super.showRecord(); //Super.showRecord()
		Sub.showRecord();  //Sub.showRecord()  //Due to method Shadowing - data hiding
	}

}
