package pl.foltak.codility.lesson1;

/**
 *
 * @author Mariusz Foltak <mariusz.foltak@coi.gov.pl>
 */
public class FrogJmp {

    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
