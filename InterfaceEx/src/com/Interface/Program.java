package com.Interface;

interface Printable{
	// int value;   //ERROR : The blank final field value may not have been initialized
	int value = 123;   //OK
	// public static final int value = 123;  //Internal 
	
	//void print() {} //ERROR : Abstract methods do not specify a body
	void print();   //OK
	//public abstract void print();  //Internal
}

class Test implements Printable{
	@Override
	public void print() {
		System.out.println("Value : "+Printable.value);
		
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p = null;  //Ok
		//p = new Printable();  //Error : Cannot instantiate the type Printable
		p = new Test();   //Upcasting
		p.print();
	}

}
