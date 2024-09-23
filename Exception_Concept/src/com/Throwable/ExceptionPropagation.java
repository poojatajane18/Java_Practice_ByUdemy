package com.Throwable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*If particular method have Exception then this particular method will be check It has CATCH block or not
 * if Catch block is not there then check previous method ,previous method also not CATCH block then last go to JVM Please handle this Exception */
public class ExceptionPropagation {
	public static void f3() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number : ");
		int number = Integer.parseInt(reader.readLine());  //"abc123"
		System.out.println("Number : "+number);
	}
	
	public static void f2() throws IOException {
		ExceptionPropagation.f3();
	}

	public static void f1() throws IOException {
		ExceptionPropagation.f2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionPropagation.f1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
