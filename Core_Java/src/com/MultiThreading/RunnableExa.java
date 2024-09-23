package com.MultiThreading;

class Task implements Runnable{
	 @Override
	 public void run() {
	 System.out.println("Hello from run method()");
	 }
	}


public class RunnableExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable target = new Task(); //Upcasting
		 Thread th = new Thread(target);
		 th.start();
	}

}
