package pl.foltak.codility.lesson2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mariusz Foltak <mariusz.foltak@coi.gov.pl>
 */
public class MaxCountersTest {

    private MaxCounters instance;

    @Before
    public void setUp() {
        instance = new MaxCounters();
    }

    @Test
    public void testOnlyMaxCounters() {
        int[] operations = {6, 6, 6, 6, 6, 6, 6};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, instance.solution(5, operations));
    }

    @Test
    public void simpleTest() {
        int[] operations = {2, 4, 6, 1, 1, 3, 1};
        int[] expected = {4, 1, 2, 1, 1};
        assertArrayEquals(expected, instance.solution(5, operations));
    }

    @Test
    public void lastOperationIsMaxCounter() {
        int[] operations = {2, 4, 6, 1, 1, 3, 6};
        int[] expected = {3, 3, 3, 3, 3};
        assertArrayEquals(expected, instance.solution(5, operations));
    }

}
