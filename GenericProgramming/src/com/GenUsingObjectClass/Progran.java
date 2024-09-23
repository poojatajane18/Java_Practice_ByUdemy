package com.GenUsingObjectClass;

import java.util.Date;

public class Progran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 123;
		Object obj = number; //OK
		/*
		Integer i = Integer.valueOf( number ); //Boxing
		Object obj = i; //Upcasting
		*/
		
		Object obj1 = new Date(); //OK


	}

}
