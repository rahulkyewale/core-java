package com.study.generics;

import java.util.List;

public class TypeInference {

	public static void main(String[] args) 
	{
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		System.out.println("Without Type inference = "+Util.<Integer, String>compare(p1, p2));
		System.out.println("With Type inference = "+Util.compare(p1, p2));
		
		
		MyListRestricted<Integer> restrictedListInteger = new MyListRestricted<Integer>();
		restrictedListInteger.add(1);
		restrictedListInteger.add(2);
		
		/* String not valid substitute for constraint "T extends Number".
		MyListRestricted<String> restrictedListInteger1 = new MyListRestricted<String>();
		restrictedListInteger1.add("One");
		restrictedListInteger1.add("Two"); */
	}

}


class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
}


class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}

class MyListRestricted<T extends Number> {
    private List<T> values;

    void add(T value) {
        values.add(value);
    }

    void remove(T value) {
        values.remove(value);
    }

    T get(int index) {
        return values.get(index);
    }
}


