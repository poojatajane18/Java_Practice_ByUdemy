package com.example.main;

class A{
	//public int num;
	private int num;
	public A() {
		this.num = 10;
	}
	public int getNum() {
		return this.num;
	}
}

class B extends A {
	//public int num;
}

public class Program1 {
	public static void main2(String[] args) {
		B b = new B();
		//System.out.println("Num : "+b.num);//The field A.num is not visible But it is inherited
		System.out.println(b.getNum());//10
		/*Private memeber of the super class is inherit into subclass but only thing is that directly
		 * we can not access but we can access through method
		 * 
		 */
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		//System.out.println("Num : "+a.num);//The field A.num is not visible it is inherit
		System.out.println(a.getNum());//10
	}

}
