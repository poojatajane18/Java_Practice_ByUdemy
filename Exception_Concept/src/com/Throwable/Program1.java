package com.Throwable;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		try {
			if(num2 == 0) {
				ArithmeticException ex = new ArithmeticException("Value of denominator should not be zero");
				throw ex;
			}
			int result = num1 / num2 ;
			System.out.println("Result : "+result);
			
		}catch(Exception ex1) {
			//No exception of type String can be thrown; an exception type must be a subclass of Throwable
		}

	}

}
