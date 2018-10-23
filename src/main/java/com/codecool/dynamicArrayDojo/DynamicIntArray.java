package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

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
        if (this.size + 1 == this.capacity) {
            this.capacity += DEFAULT_CAPACITY;
            this.data = Arrays.copyOf(this.data, this.capacity);
        }
        this.data[this.size] = number;
        this.size += 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(" ");
            sb.append(this.data[i]);
        }
        return sb.toString();
    }
}
