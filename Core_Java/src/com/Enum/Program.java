package com.Enum;

enum Color{
	RED,GREEN,BLUE
}


public class Program {
	
	
	public static void main(String[] args) {
		Color[] colors = Color.values();
		for(Color color : colors)
			System.out.println(color.name()+" "+color.ordinal());
	}
	
	
	public static void main2(String[] args) {
		Color color = Color.RED;
		System.out.println(color.name()+" "+color.ordinal());  //RED 0
		
		Color color1 = Color.GREEN;
		System.out.println(color1.name()+" "+color1.ordinal()); //GREEN 1
		
		Color color2 = Color.BLUE;
		System.out.println(color2.name()+" "+color2.ordinal());  //BLUE 2
	}
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Color.RED.name());   //RED
		System.out.println(Color.RED.ordinal()); //0
		
		System.out.println(Color.GREEN.name());  //GREEN
		System.out.println(Color.GREEN.ordinal());//1
		
		System.out.println(Color.BLUE.name());  //BLUE
		System.out.println(Color.BLUE.ordinal());//2

	}

}
