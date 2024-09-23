package com.Static;

class Test{
	private int num1;
	private int num2;
	private static int count ;
	
	//Static Initializer Block
	static {
		System.out.println("Hello");  ///This block is always execute first
		Test.count=600;
	}

	public Test(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void printRecord() {
		System.out.println(num1+" "+num2+" "+Test.count);
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test(10,20);
		t.printRecord();

	}

}

/* OUTPUT : 
 * Hello
   10 20 600
*/
