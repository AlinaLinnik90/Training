package demo;

import com.task3.linkedlist.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList list = new LinkedList();

    public void fillList() {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void testAdd() {
        fillList();
        assertEquals(2, list.get(1).intValue());
    }

    @Test
    public void testSize() {
        fillList();
        assertEquals(Integer.valueOf(3), list.size());
    }

    @Test
    public void testSizeIsNull() {
        assertNull(list.size());
    }

    @Test
    public void testGetWrong() {
        fillList();
        assertNull(list.get(-2));
        assertNull(list.get(100));
    }

    @Test
    public void testDelete() {
        fillList();
        assertTrue(list.delete(1));
        assertFalse(list.delete(-10));
        assertFalse(list.delete(500));
    }

}
