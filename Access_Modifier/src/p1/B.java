package p1;

public class B extends A{
	/*  -----private Acees-Modifier----
	public void displayRecord() {
		//Private memember inherit the subclass but not accessible
		System.out.println("Num1 : "+this.num1);  /*The field A.num1 is not visible*/
		//System.out.println("Num2 : "+this.num2); 
						/*num2 cannot be resolved or is not a field
	}*/
	
	
	/* ----Package Level private ---
	public void displayRecord() {
		System.out.println("Num1 : "+this.num1); // Package private is accessible in sub class
	}
	*/
	
	/* ----Protected-------
	public void displayRecord() {
		System.out.println("Num1 : "+this.num1); //Accessible in subclass
	}
	*/
	
	/*---Public----*/
	public void displayRecord() {
		System.out.println("Num1 : "+this.num1);//Accessible in subclass
	}

}
