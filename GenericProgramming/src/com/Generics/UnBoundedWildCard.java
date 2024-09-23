package com.Generics;

/*
 * Types of wild card : 
		Unbouned wild card       : (ArrayList<?> list)
		Upper Bouned wild card   : (ArrayList<? extends Number>) 
		Lower Bounded wild card  : (ArrayList<? super Integer> list)
 */

import java.util.ArrayList;


public class UnBoundedWildCard {
	
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
		 //Unbounded wild card
		 private static void printRecord(ArrayList<?> list) {
			 for (Object element : list)
			 System.out.println(element);
		 }
	
	public static void main(String[] args) {
		ArrayList<Integer> integerList = UnBoundedWildCard.getIntegerArrayList();
		UnBoundedWildCard.printRecord( integerList );
		ArrayList<Double> doubleList = UnBoundedWildCard.getDoubleArrayList();
		UnBoundedWildCard.printRecord(doubleList);
		ArrayList<String> stringList = UnBoundedWildCard.getStringArrayList();
		UnBoundedWildCard.printRecord(stringList );
		
	}

}
