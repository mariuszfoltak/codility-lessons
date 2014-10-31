package pl.foltak.codility.lesson2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FrogRiverOneTest {

    private FrogRiverOne instance;

    @Before
    public void setUp() {
        instance = new FrogRiverOne();
    }

    @Test
    public void testWhenFrogNeverAcross() {
        int[] array = {1, 3, 1, 3};
        assertEquals(-1, instance.solution(3, array));
    }

    @Test
    public void testAscendingSortedArray() {
        assertEquals(3, instance.solution(3, new int[]{1, 1, 2, 3}));
    }

    @Test
    public void testDescendingSortedArray() {
        assertEquals(3, instance.solution(3, new int[]{3, 2, 2, 1}));
    }

    @Test
    public void testUnsortedArray() {
        assertEquals(4, instance.solution(4, new int[]{4, 1, 2, 1, 3, 4}));
    }

    @Test
    public void testOneElementArray() {
        assertEquals(0, instance.solution(1, new int[]{1}));
    }

}
