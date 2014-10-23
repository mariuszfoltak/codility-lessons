
package pl.foltak.codility.lesson1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mariusz Foltak <mariusz.foltak@coi.gov.pl>
 */
public class FrogJmpTest {
    
    private FrogJmp instance;
    
    @Before
    public void setUp() {
        instance = new FrogJmp();
    }

    @Test
    public void testFrogPositionGreather() {
        assertEquals(3, instance.solution(10, 85, 30));
    }

    @Test
    public void testFrogPositonEqual() {
        assertEquals(2, instance.solution( 0, 60, 30));
    }

    @Test
    public void testFrogAlreadyOnTargetPositoin() {
        assertEquals(0, instance.solution(10, 10, 5));
    }
    
}
