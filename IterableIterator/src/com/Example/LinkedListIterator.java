package com.Example;

import java.util.Iterator;

public class LinkedListIterator implements Iterator<Integer>{
	
	private Node trav;
	
	public LinkedListIterator(Node head) {
		this.trav = head;
	}

	@Override
	public boolean hasNext() {
		return this.trav != null;
	}

	@Override
	public Integer next() {
		int data = trav.data;
		trav = trav.next;
		return data;
	}

}
