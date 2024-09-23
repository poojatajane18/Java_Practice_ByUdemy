package com.AutoCloseable_Closeable;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

class Test implements Closeable{
	private Scanner sc ;
	
	public Test() {
		this.sc = new Scanner(System.in);
	}

	@Override  
	public void close() throws IOException {
		// TODO Auto-generated method stub
		this.sc.close();
	}
	
}

public class CloseableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Test t = new Test();
			t.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
