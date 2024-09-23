package p2;

import p1.A;

public class D extends A{
	
	/*private Acees-Modifier
	 * 
	public void printNum1() {
		System.out.println("Num1 : "+this.num1); //The field A.num1 is not visible
	}
	*/
	
	
	
	/*Package Private : Not accessible in subclass in different package
	public void printNum1() {
		System.out.println("Num1 : "+this.num1); //The field A.num1 is not visible
	}
	*/
	
	/* Protected
	public void printNum1() {
		System.out.println("Num1 : "+this.num1); //Accessible in subclass in different package
	}
	*/
	
	/* Public */
	public void printNum1() {
		System.out.println("Num1 : "+this.num1); //Accessible in subclass in different package
	}

}
