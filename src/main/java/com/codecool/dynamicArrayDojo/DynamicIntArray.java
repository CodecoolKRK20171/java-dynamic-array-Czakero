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

    public void removeObject(int object) {
        long removedItems = Arrays.stream(this.data).filter(e -> e == object).count();
        this.data = Arrays.stream(this.data).filter(e -> !(e == object)).toArray();
        this.size -= removedItems;

    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            DynamicIntArray array = new DynamicIntArray();
            for (int i = 0; i < this.size; i++) {
                if (i != index) {
                    array.add(this.data[i]);
                }
            }
            this.data = array.data;
            this.size = array.size;
        }

    }

    public String toString() {
        System.out.println("Size: " + this.size + " Capacity: " + this.capacity + " Length: " + this.data.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            sb.append(" ");
            sb.append(this.data[i]);
        }
        return sb.toString();
    }
}
