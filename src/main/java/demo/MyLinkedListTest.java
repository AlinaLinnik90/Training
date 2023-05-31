package demo;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyLinkedListTest {
    MyLinkedList list = new MyLinkedList();

    @Before
    public void fillList() {
        list.add(1);
        list.add(2);
        list.add(3);
    }


    @Test
    public void testAdd() {
        assertEquals(2, list.get(1).intValue());
    }

    @Test
    public void testSize() {
        assertEquals(3, list.size());
    }

    @Test
    public void testGetWrong() {
        assertNull(list.get(-2));
        assertNull(list.get(100));
    }

    @Test
    public void testDelete() {
        assertTrue(list.delete(1));
        assertFalse(list.delete(-10));
        assertFalse(list.delete(500));
    }
}

