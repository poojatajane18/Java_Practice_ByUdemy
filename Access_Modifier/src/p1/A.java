package p1;

public class A {
	
	/* -----private ----
	private int num1 = 10; //It is applicable fields & Method
	
	public void showRecord() {
		System.out.println("Num1 : "+this.num1); //Private Memeber access in same class
	}*/
	
	
	/*
	int num1 = 10;  //-------Default : Package level Private ------
	public void showRecord() {
		System.out.println("Num1 : "+this.num1);  //Accessible in same class
	}
	*/
	
	
	/*  -----Protected-------
	protected int num1 = 10;
	public void showRecord() {
		System.out.println("Num1 : "+this.num1); //Accessible in same class
	}
	*/
	
	/*  ------Public ------*/
	public int num1=10;
	public void showRecord() {
		System.out.println("Num1 : "+this.num1); //Accessible in same class
	}
	
	
	
}
