package com.Throwable;

class MyException{
	private String message;
	public MyException(String message) {
		this.message = message;
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		try {
			if(num2 == 0)
				//throw 0;  //No exception of type int can be thrown; an exception type must be a subclass of Throwable
				
				//throw "/ by 0";  //No exception of type String can be thrown; an exception type must be a subclass of Throwable
				
				//throw new MyException("/ by zero");  //No exception of type MyException can be thrown; an exception type must be a subclass of Throwable
				System.out.println("Num2 : "+num2);
			int result = num1 / num2 ;
			System.out.println("Result : "+result);
		}catch(Exception ex) {
			System.out.println(ex);
		}

	}

}
