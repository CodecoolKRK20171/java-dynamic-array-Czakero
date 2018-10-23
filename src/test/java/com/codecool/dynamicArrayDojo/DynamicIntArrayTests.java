package com.codecool.dynamicArrayDojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicIntArrayTests {


    @Test
    public void testAddingNumber() {
        DynamicIntArray array = new DynamicIntArray();

        array.add(5);

        assertEquals(" 5", array.toString());
    }

    @Test
    public void testAddingNumberOverCapacity() {
        DynamicIntArray array = getFullArray();
        String result = " 0 1 2 3 4 5 6 7 8 9 10";

        array.add(10);

        assertEquals(result, array.toString());
    }

    private DynamicIntArray getFullArray() {
        DynamicIntArray array = new DynamicIntArray();

        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        return array;
    }

}