package com.purn.ds;

import java.util.LinkedList;

public class MyHashMap {

	private static final int SIZE = 1000;

    static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int hash(int key) {
        return Math.floorMod(key, SIZE);
    }

    // Insert or update
    public void put(int key, int value) {

        int index = hash(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        buckets[index].add(new Node(key, value));
    }

    // Retrieve value
    public int get(int key) {

        int index = hash(key);

        if (buckets[index] == null) {
            return -1;
        }

        for (Node node : buckets[index]) {
            if (node.key == key) {
                return node.value;
            }
        }

        return -1;
    }

    // Remove key-value pair
    public void remove(int key) {

        int index = hash(key);

        if (buckets[index] == null) {
            return;
        }

        buckets[index].removeIf(node -> node.key == key);
    }

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(2, 200);

        System.out.println(map.get(1)); // 100
        System.out.println(map.get(2)); // 200
        System.out.println(map.get(3)); // -1

        map.put(1, 500);

        System.out.println(map.get(1)); // 500

        map.remove(2);

        System.out.println(map.get(2)); // -1
    }
}
