package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int DEFAULT_SIZE = 0;
    private int capacity;
    private int size;
    private int[] data;

    public DynamicIntArray() {
        this.data = new int[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.size = DEFAULT_SIZE;
    }

    public DynamicIntArray(int capacity) {
        this.data = new int[capacity];
        this.capacity = capacity;
        this.size = DEFAULT_SIZE;
    }

    public void add(int number) {

    }
}
