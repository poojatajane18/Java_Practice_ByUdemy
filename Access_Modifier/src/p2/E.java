package p2;
import p1.A;

public class E {
	/***private Acees-Modifier
	 
	A a = new A();
	public void displayNum1() {
		System.out.println("Num1 : "+a.num1); //The field A.num1 is not visible
	} 
	
	***/
	
	/*Package Private : Not accessible in non-subclass in different package
	A a = new A();
	public void displayNum1() {
		System.out.println("Num1 : "+a.num1); //The field A.num1 is not visible
	} 
	*/
	
	/**** Protected
	A a = new A();
	public void displayNum1() {
		System.out.println("Num1 : "+a.num1);//The field A.num1 is not visible
	}
	****/
	
	
	/* Public */
	A a = new A();
	public void displayNum1() {
		System.out.println("Num1 : "+a.num1);//Accessible in non-subclass in different package
	}

}
