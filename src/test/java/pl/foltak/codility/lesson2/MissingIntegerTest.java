package pl.foltak.codility.lesson2;

import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MissingIntegerTest {

    private MissingInteger instance;

    @Before
    public void setUp() {
        instance = new MissingInteger();
    }

    @Test
    public void testAscendingSortedNumbers() {
        int[] array = {-5, -4, -3, -1, 0, 1, 2, 3, 4, 5, 6};
        assertEquals("It isn't minimal positive integer", 7, instance.solution(array));
    }

    @Test
    public void testDescendingSortedNumbers() {
        int[] array = {5, 4, 3, 1, 0, -1, -2, -3, -6};
        assertEquals("It isn't minimal positive integer", 2, instance.solution(array));
    }

    @Test
    public void testOnlyNonNegativeNumbers() {
        int[] array = {4, 20, 2, 5, 1, 3, 5, 0};
        assertEquals("It isn't minimal positive integer", 6, instance.solution(array));
    }

    @Test
    public void testOnlyNonPositiveNumbers() {
        int[] array = {-10, -2, -7, -3, -4, -7, -1};
        assertEquals("It isn't minimal positive integer", 1, instance.solution(array));
    }

    @Test
    public void testBigNumbersFromOne() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        assertEquals("It isn't minimal positive integer", 100001, instance.solution(array));
    }

    @Test
    public void testBigNumbersWithoutOne() {
        int[] array = new int[1000000];
        for (int i = 900000; i < array.length; i++) {
            array[i] = i + 1;
        }
        assertEquals("It isn't minimal positive integer", 1, instance.solution(array));
    }

    @Test
    public void testRandomBigNumbers() {
        Random r = new Random();
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt() * (r.nextInt(1) - 1);
            if (array[i] == 4) {
                array[i] = 5;
            }
        }
        array[43456] = 1;
        array[11723] = 2;
        array[22485] = 3;
        assertEquals("It isn't minimal positive integer", 4, instance.solution(array));
    }

}
