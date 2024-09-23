package com.NestedLocalClass;

public class MethodAnonymousInnerC {

	public static void main(String[] args) {
		//Object obj; //obj is refernce of java.lang.Object class	
		//new Object( ); //Anonymous instance of java.lang.Object class
		
		//Object obj = new Object(); //Instance with object reference
		
		Object obj = new Object() { //MethodAnonymousInnerC$1.class
			private String message = "Hello World";
			 @Override
			 public String toString() {
				 return this.message;
			 }
		};
		String str = obj.toString();
		System.out.println( str );

	}

}
