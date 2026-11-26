package com.purn.ds;

import java.util.LinkedList;

public class MyHashSet {

	private static final int SIZE = 1009;

	private LinkedList<Integer>[] buckets;

	@SuppressWarnings(value = { "unchecked" })
	public MyHashSet() {
		buckets = new LinkedList[SIZE];
	}

	public int hash(int key) {
		return key % SIZE;
	}

	public void add(int key) {
		int index = hash(key);

		if (buckets[index] == null) {
			buckets[index] = new LinkedList<>();
		}

		if (!buckets[index].contains(key)) {
			buckets[index].add(key);
		}

	}

	public boolean contains(int key) {
		int index = hash(key);
		return buckets[index] != null && buckets[index].contains(key);
	}

	public void remove(int key) {
		int index = hash(key);
		if (buckets[index] != null) {
			buckets[index].remove(Integer.valueOf(key));
		}
	}

	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();

		set.add(1);
		set.add(2);
		set.add(2);

		System.out.println(set.contains(1));
		System.out.println(set.contains(3));

		set.remove(2);

		System.out.println(set.contains(2));
	}
}
