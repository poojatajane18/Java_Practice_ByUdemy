package com.Static;

public class Program2 {
	private int num1 =10;
	private static int num2 =20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("NUM1 : "num1); // Not ok
		Program2 p = new Program2();
		System.out.println("NUM1 : "+p.num1);
		System.out.println("NUM2 : "+num2);

	}

}
