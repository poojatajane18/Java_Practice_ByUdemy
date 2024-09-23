package com.Generics;

import java.util.ArrayList;

public class LowerBounWildCard {
	public static ArrayList<Integer> getIntegerArrayList( ) {
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 return list;
	}
	public static ArrayList<Double> getDoubleArrayList( ) {
		 ArrayList<Double> list = new ArrayList<>();
		 list.add(10.1);
		 list.add(20.2);
		 list.add(30.3);
		 return list;
	}
	public static ArrayList<String> getStringArrayList( ) {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("DAC");
		 list.add("DMC");
		 list.add("DESD");
		 return list;
	}
		 //Lowerbounded wild card
	private static void printRecord(ArrayList<? super Integer> list) {
		for (Object element : list)
		System.out.println(element);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integerList = LowerBounWildCard.getIntegerArrayList();
		LowerBounWildCard.printRecord( integerList ); //OK
		ArrayList<Double> doubleList = LowerBounWildCard.getDoubleArrayList();
		//LowerBounWildCard.printRecord(doubleList); //NOT OK
		ArrayList<String> stringList = LowerBounWildCard.getStringArrayList();
		//LowerBounWildCard.printRecord(stringList ); //Not OK

	}

}
