package com.Comparator_Comparable;

import java.util.Comparator;

public class JobComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getJob().compareTo(e2.getJob());
 }
}


