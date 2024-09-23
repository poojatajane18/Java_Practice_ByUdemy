package com.AutoCloseable_Closeable;

import java.util.Scanner;

//  class Test1 ==> Resource Type
class Test1 implements AutoCloseable{
	private Scanner sc ;
	public Test1() {
		this.sc = new Scanner(System.in);
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		this.sc.close();
	}
}

public class AutoCloseableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Test1 t1 = new Test1();     //  ==> Resource
			t1.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
