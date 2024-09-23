package com.Boxing;

import java.time.LocalDate;
import java.util.Arrays;

public class Program {
	public static void main(String[] args) {
		Object []arr = new Object[3];
		arr[0] = new Integer(123);
		arr[1] = new String("DAC");
		arr[2] = LocalDate.now();
		System.out.println(Arrays.toString(arr));
	}
	public static void main5(String[] args) {
		Object[] arr =  new String[3];
		arr[0] = new String("ABC");
		arr[1] = "PQR";
		//arr[2] = new StringBuffer("XYZ"); // java.lang.ArrayStoreException:
		System.out.println(Arrays.toString(arr));
	}
	public static void main4(String[] args) {
		/*Object o1 = new String("ABC");
		Object o2 = new String("PQR");
		Object o3 = new String("XYZ");*/
		
		Object[] arr =  new String[3];
		arr[0] = new String("ABC");
		arr[1] = new String("PQR");
		arr[2] = new String("XYZ");
		System.out.println(Arrays.toString(arr));//[ABC, PQR, XYZ]
	}
	
	public static void main3(String[] args) {
		String []arr = new String[3];
		System.out.println(Arrays.toString(arr));//[null, null, null] - Array of reference
		arr[0] = new String("ABC");
		arr[1] = "PQR";
		arr[2] = new String("XYZ");
		
		System.out.println(Arrays.toString(arr));//[ABC, PQR, XYZ]

	}
	public static void main2(String[] args) {
		int number = 123;
		//Object o = number; Compiler - implicitly called
		//Integer.valueOf(number); //Auto-Boxing
		Object o = Integer.valueOf(number); //Upcasting
		System.out.println(o);
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		String str = String.valueOf(number);  //Boxing
		System.out.println(str); // 10
		
		Integer i = Integer.valueOf(number);  //Boxing
		System.out.println(i); //10
		
		Integer i1 = new Integer(123);
		Object o = i; // Upcasting
		Object o1 = new Integer(123);  //Upcasting
		Object o2 = Integer.valueOf(123);//Upcasting
		
	}

}
