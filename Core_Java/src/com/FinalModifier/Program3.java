package com.FinalModifier;

class Test {
	//private final int number; // NOT OK
	
	//private final int number = 10; //OK
	
	
	/*private final int number;
	public Test() {
		// TODO Auto-generated constructor stub
		this.number = 10; //OK
	}*/
	
	
	/*private final int number = 20; //OK
	public Test() {
		// TODO Auto-generated constructor stub
		this.number=5; //NOT OK
	}*/
	
	
	private final int NUMBER = 10;
	
	public void showRecord() {
		// this.NUMBER = this.NUMBER + 1;  //NOT OK
		System.out.println("Number : "+this.NUMBER);
		
	}
	public void printRecord() {
		// this.NUMBER = this.NUMBER + 1;  //NOT OK
		System.out.println("Number : "+this.NUMBER);
		
	}
	
	
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.showRecord(); //10
		test.printRecord(); //10
	}

}
