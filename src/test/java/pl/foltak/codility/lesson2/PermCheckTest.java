package pl.foltak.codility.lesson2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mariusz Foltak <mariusz@foltak.pl>
 */
public class PermCheckTest {

    private PermCheck instance;

    @Before
    public void setUp() {
        instance = new PermCheck();
    }

    @Test
    public void testArrayIsPermutation() {
        int[] array = new int[100000];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        assertEquals("It should be 1", 1, instance.solution(array));
    }

    @Test
    public void testArrayIsNotPermutationMissingFirstElement() {
        int[] array = new int[100000];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = i;
        }
        assertEquals("It should be 0", 0, instance.solution(array));
    }

    @Test
    public void testArrayIsNotPermutationMissingLastElement() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        assertEquals("It should be 0", 0, instance.solution(array));
    }

}
