package com.ExceptionChaining;

abstract class A2 {
	public abstract void print();
}

class B2 extends A2 {

	@Override
	public void print() throws RuntimeException{
		// TODO Auto-generated method stub
		try {
			for(int count = 1; count <=10; ++ count) {
				/*if(count == 6) {
					Thread.currentThread().interrupt();
				}*/
				
				/*
				 * OUTPUT : It is handled main method catch block
				 * 	Count : 1
					Count : 2
					Count : 3
					Count : 4
					Count : 5
					Count : 6
					java.lang.InterruptedException: sleep interrupted
				 */
				System.out.println("Count : "+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException cause) {  //Failure of sleep()method ==> InterruptedException
			// TODO Auto-generated catch block
			throw new RuntimeException(cause);  //Exception chaining - Process of handling exception by throwing new type of exception is called as exception chaining.

		}
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			A2 a2 = new B2();
			a2.print();  //Dynamic method Dispatch
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			Throwable cause = e.getCause();
			System.out.println(cause);
		}
	}

}
