package p1;

public class C {
	
	/*private Acees-Modifier
	public void printRecord() {
		A a = new A();
		System.out.println("Num1 : "+a.num1); //The field A.num1 is not visible
	}
	*/
	
	
	/* Package private
	public void printRecord() {
		A a = new A();
		System.out.println("Num1 : "+a.num1);// Accessible in Non-sub class in same package but create instance
	}
	*/
	
	
	/* Protected
	public void printRecord() {
		A a = new A();
		System.out.println("Num1 : "+a.num1);// Accessible in Non-sub class in same package but create instance
	}
	*/
	
	/* Public */
	public void printRecord() {
		A a = new A();
		System.out.println("Num1 : "+a.num1);// Accessible in Non-sub class in same package but create instance
	}

}
