package com.Generics;

import java.util.ArrayList;

public class UpperBoundedWildCard {
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
		 //Upperbounded wild card
	private static void printRecord(ArrayList<? extends Number> list) {
			 for (Object element : list)
			 System.out.println(element);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integerList = UpperBoundedWildCard.getIntegerArrayList();
		UpperBoundedWildCard.printRecord( integerList ); //OK
		ArrayList<Double> doubleList = UpperBoundedWildCard.getDoubleArrayList();
		UpperBoundedWildCard.printRecord(doubleList); //OK
		ArrayList<String> stringList = UpperBoundedWildCard.getStringArrayList();
		 //UpperBoundedWildCard.printRecord(stringList ); //Not OK
	}


}
