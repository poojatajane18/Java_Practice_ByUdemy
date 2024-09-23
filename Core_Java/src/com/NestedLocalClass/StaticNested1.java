package com.NestedLocalClass;

class Outer4{
	 private int num1 = 10;
	 private static int num2 = 20;
	 
	 static class Inner4{
		 private int num3 = 30; //OK
		 private static int num4 = 40; //OK
		 
		 public void print( ) {
			 //System.out.println("Num1 : "+num1); //Not OK
			 Outer4 out = new Outer4();
			 System.out.println("Num1 : "+out.num1); //OK //10
			 System.out.println("Num2 : "+num2); //OK  //20
			 System.out.println("Num3 : "+this.num3);  //30
			 System.out.println("Num4 : "+Inner4.num4); //40
		 }
	 }
}


public class StaticNested1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4.Inner4 in = new Outer4.Inner4();
		in.print();


	}

}
