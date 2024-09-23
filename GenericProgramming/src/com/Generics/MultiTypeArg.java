package com.Generics;

interface Map<K, V>{
	K getKey();
	V getValue();
}

class HashMap<K, V> implements Map<K,V>{
	private K key;
	private V value;
	
	public HashMap(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public V getValue() {
		return this.value;
	}
	
}

public class MultiTypeArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>(1, "KDK");
		Integer key = map.getKey();
		String value = map.getValue();
		System.out.println(key+" "+value);

	}

}
