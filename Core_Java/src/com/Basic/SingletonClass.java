package com.Basic;

class Singleton {
	private Singleton() {
		System.out.println("Inside Constructor");
		
	}
	private static Singleton reference;
	public static Singleton getReference(){
		if(reference == null)
			reference = new Singleton();
		return reference;
		
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getReference(); //only one time call 
		Singleton s2 = Singleton.getReference();

		

	}

}
