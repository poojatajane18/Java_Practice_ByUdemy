package com.Exception;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		try {
			System.out.println("2");
			int a=10,b=2,c=0;
			System.out.println("3");
			c=a/c;
			System.out.println("4");
			System.out.println(c);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("5");
			System.out.println("c");
			System.out.println("6");
			// TODO: handle exception
		}
		System.out.println("Railworld");

	}

}
