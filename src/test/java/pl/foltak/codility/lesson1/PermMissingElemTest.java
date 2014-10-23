package pl.foltak.codility.lesson1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PermMissingElemTest {

    private PermMissingElem instance;

    @Before
    public void setUp() {
        instance = new PermMissingElem();
    }

    @Test
    public void testUnsortedArray() {
        int[] array = {2, 3, 1, 5};
        assertEquals(4, instance.solution(array));
    }

    @Test
    public void testAscendingSortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9};
        assertEquals(8, instance.solution(array));
    }

    @Test
    public void testDescendingSortedArray() {
        int[] array = {9, 8, 7, 6, 4, 3, 2, 1};
        assertEquals(5, instance.solution(array));
    }

    @Test
    public void testOneElementArrayWithLastElementMissing() {
        int[] array = {1};
        assertEquals(2, instance.solution(array));
    }

    @Test
    public void testOneElementArrayWithFirstElementMissing() {
        int[] array = {2};
        assertEquals(1, instance.solution(array));
    }

    @Test
    public void testMaxElementsArrayWithLastElementMissing() {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = i + 1;
        }
        assertEquals(100001, instance.solution(array));
    }

    @Test
    public void testMaxElementsArrayWithFirstElementMissing() {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = i + 2;
        }
        assertEquals(1, instance.solution(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(1, instance.solution(array));
    }

}
