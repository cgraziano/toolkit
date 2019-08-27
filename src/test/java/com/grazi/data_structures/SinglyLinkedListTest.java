package com.grazi.data_structures;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import com.grazi.data_structures.SinglyLinkedList;

import java.util.List;



public class SinglyLinkedListTest {
    private List<Integer> list;

    @Before
    public void setup() {
        list = new SinglyLinkedList();
    }

    @Test
    public void testAddWithEmptyAndNonEmptyList() {
        checkSize(0, list);
        Integer number0 = 4;
        list.add(number0);

        Integer actualValue = list.get(0);
        Integer expectedValue = number0;
        assertEquals(expectedValue, actualValue);
        checkSize(1, list);

        Integer number1 = 5;
        list.add(number1);
        actualValue = list.get(1);
        expectedValue = number1;
        assertEquals(expectedValue, actualValue);
        checkSize(2, list);

    }

    private void checkSize(int expectedSize, List list) {
        int actualSize = list.size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAddIndex() {
        Integer number0 = 4;
        list.add(number0);

        Integer actualValue = list.get(0);
        Integer expectedValue = number0;
        assertEquals(expectedValue, actualValue);

        Integer number1 = 5;
        list.add(number1);
        actualValue = list.get(1);
        expectedValue = number1;

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testAddAll() {
        assertTrue(false);
    }

    @Test
    public void testAddAllIndex() {
        assertTrue(false);
    }

    @Test
    public void testClear() {
        assertTrue(false);
    }

    @Test
    public void testContains() {
        assertTrue(false);
    }

    @Test
    public void testContainsAll() {
        assertTrue(false);
    }

    @Test
    public void testEquals() {
        assertTrue(false);
    }

    @Test
    public void testGet() {
        Integer number0 = 4;
        list.add(number0);

        Integer number1 = 5;
        list.add(number1);

        Integer expectedValue = list.get(0);
        Integer actualValue = number0;
        assertEquals(expectedValue, actualValue);

        expectedValue = list.get(1);
        actualValue = number1;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testHashCode() {
        assertTrue(false);
    }

    @Test
    public void testIndexOf() {
        assertTrue(false);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(false);
    }

    @Test
    public void testI() {
        assertTrue(false);
    }

    @Test
    public void testLastIndexOf() {
        assertTrue(false);
    }

    @Test
    public void testListIterator() {
        assertTrue(false);
    }

    @Test
    public void testListIteratorIndex() {
        assertTrue(false);
    }

    @Test
    public void testRemoveIndex() {
        assertTrue(false);
    }

    @Test
    public void testRemoveObject() {
        assertTrue(false);
    }

    @Test
    public void testRemoveAll() {
        assertTrue(false);
    }

    @Test
    public void testReplaceAll() {
        assertTrue(false);
    }

    @Test
    public void testRetainAll() {
        assertTrue(false);
    }

    @Test
    public void testSet() {
        assertTrue(false);
    }

    @Test
    public void testSize() {
        Integer number1 = new Integer(4);
        list.add(number1);

        int actualSize = list.size();
        int expectedSize = 1;
        assertEquals(expectedSize, actualSize);

        number1 = new Integer(5);
        list.add(number1);
        actualSize = list.size();
        expectedSize = 2;

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testSort() {
        assertTrue(false);
    }

    @Test
    public void testSpliterator() {
        assertTrue(false);
    }

    @Test
    public void testSubList() {
        assertTrue(false);
    }

    @Test
    public void testToArrayObject() {
        assertTrue(false);
    }
        
    @Test
    public void testToArray() {
        assertTrue(false);
    }

        

}
