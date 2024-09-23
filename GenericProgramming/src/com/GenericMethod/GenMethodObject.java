package com.GenericMethod;

import java.util.Date;

public class GenMethodObject {
	public static void print(Object object) {
		System.out.println(object);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenMethodObject.print(true);
		GenMethodObject.print(123);
		GenMethodObject.print('A');
		GenMethodObject.print(123456);
		GenMethodObject.print(3.142f);
		GenMethodObject.print(123.4567d);
		GenMethodObject.print("Good Morning");
		GenMethodObject.print(new Date());
	}

}
