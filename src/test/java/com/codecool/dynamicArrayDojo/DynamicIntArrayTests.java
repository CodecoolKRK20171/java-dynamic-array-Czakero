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

    @Test
    public void testRemovingZero() {
        DynamicIntArray array = getFullArray();
        String result = " 1 2 3 4 5 6 7 8 9";

        array.remove(0);

        assertEquals(result, array.toString());
    }

    @Test
    public void testRemovingNumber() {
        DynamicIntArray array = getFullArray();
        String result = " 0 1 2 3 4 6 7 8 9";

        array.remove(5);

        assertEquals(result, array.toString());
    }

    @Test
    public void testRemovingNumberWhichOccursMoreThanOnce() {
        DynamicIntArray array = getArrayWithMultpiliedValue();
        String result = " 0 0 1 1 2 2 3 3 4 4 6 6 7 7 8 8 9 9";

        array.removeObject(5);

        assertEquals(result, array.toString());
    }

    @Test
    public void testWhenRemovingWithIndexOutOfRangeShouldThrowException() {
        DynamicIntArray array = getFullArray();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(10));
    }

    @Test
    public void testWhenRemovingWithIndexOutOfRangeShouldThrowException2() {
        DynamicIntArray array = getFullArray();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(-1));
    }

    @Test
    public void testInsertingOnIndexLesserThan0() {
        DynamicIntArray array = getFullArray();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.insert(-1, 2));
    }

    @Test
    public void testCorrectInsertingNumber() {
        DynamicIntArray array = getFullArray();
        String result = " 0 1 2 3 6 4 5 6 7 8 9";

        array.insert(4, 6);

        assertEquals(result, array.toString());
    }

    @Test
    public void testInsertingNumberWithIndexOutOfRange() {
        DynamicIntArray array = getFullArray();
        String result = " 0 1 2 3 4 5 6 7 8 9 423";

        array.insert(5453, 423);

        assertEquals(result, array.toString());
    }

    private DynamicIntArray getFullArray() {
        DynamicIntArray array = new DynamicIntArray();

        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        System.out.println(array.toString());
        return array;
    }

    private DynamicIntArray getArrayWithMultpiliedValue() {
        DynamicIntArray array = new DynamicIntArray();

        for (int i = 0; i < 10; i++) {
            array.add(i);
            array.add(i);
        }
        array.add(5);

        return array;
    }

}