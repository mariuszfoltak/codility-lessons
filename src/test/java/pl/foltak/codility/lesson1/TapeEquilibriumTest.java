
package pl.foltak.codility.lesson1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mariusz Foltak <mariusz.foltak@coi.gov.pl>
 */
public class TapeEquilibriumTest {
    
    private TapeEquilibrium instance;
    
    @Before
    public void setUp() {
        instance = new TapeEquilibrium();
    }

    @Test
    public void testUnsortedArray() {
        int[] a = {5,4,2,7,1};
        Assert.assertEquals(1, instance.solution(a));
    }

    @Test
    public void testAscendingSortedArray() {
        int[] a = {1,4,7,9,15};
        Assert.assertEquals(6, instance.solution(a));
    }

    @Test
    public void testDescendingSortedArray() {
        int[] a = {88,23,22,11,9,6,3,1};
        Assert.assertEquals(13, instance.solution(a));
    }

    @Test
    public void testTwoValues() {
        int[] a = {-3000,5000};
        Assert.assertEquals(8000, instance.solution(a));
    }

    @Test
    public void testNegativeAndPositiveValues() {
        int[] a = {2,-4,5,-3,2};
        Assert.assertEquals(2, instance.solution(a));
    }
    
    @Test
    public void testNegativeValues() {
        int[] a = {-2,-4,-5,-3,-2};
        Assert.assertEquals(4, instance.solution(a));
    }
    
}
