package com.wrapper;

/*
 *1. In Java, primitive types are not classes. If we want to process values of primitive type then we can use
corresponding class. It is called wrapper class.
2. All the wrapper classes are final and declared in java.lang package.
3. All the wrapper classes implments java.lang.Comparable and java.io.Serializable interface.
4. Any Wrapper class do not contain parameterless constructor
 */

public class Program {
	public static void main(String[] args) {
		//int n1 = new int( 10 ); //Not OK
		Integer n1 = new Integer( 10 ); //OK
		Number n2 = new Integer( 10 ); //OK: Upcasting
		Object n3 = new Integer( 10 ); //OK: Upcasting
	}
}
