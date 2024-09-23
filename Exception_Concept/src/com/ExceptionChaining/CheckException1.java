package com.ExceptionChaining;

class P extends Exception{}
class Q extends Exception{}
class R extends Exception{}
class S extends Exception{}

public class CheckException1 {
	//public static void print(int number) throws P,Q,R {
	public static void print(int number) throws Exception {	
		if(number == 10)
			throw new P();
		if(number == 20)
			throw new Q();
		if(number == 30)
			throw new R();
		System.out.println("Number : "+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CheckException1.print(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
