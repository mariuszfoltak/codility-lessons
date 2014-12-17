package pl.foltak.codility.lesson3;

/**
 *
 * @author mfoltak
 */
public class test {

    public int solution(int[] A) {
        int index = -1;
        double minAVG = Long.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            double avg2 = (A[i] + A[i + 1]) / 2.;
            if (minAVG > avg2) {
                minAVG = avg2;
                index = i;
            }
            if (i + 2 < A.length) {
                double avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.;
                if (minAVG > avg3) {
                    minAVG = avg3;
                    index = i;
                }
            }
        }
        return index;
    }
}
