package com.wrapper;

//If boxing is done implicitly then it is called auto-boxing

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		Object obj = number; //Auto-Boxing
		//Integer i = Integer.valueOf(number) //Boxing
		//Object o = i; //Upcasting
		System.out.println( obj );

	}

}
