package pl.foltak.codility.lesson2;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        boolean[] array = new boolean[X];
        int expectedSum = (int) sumArithmeticSequence(1, X, X);
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (!array[A[i] - 1]) {
                array[A[i] - 1] = true;
                sum += A[i];

                if (expectedSum == sum) {
                    return i;
                }
            }
        }

        return -1;
    }

    private long sumArithmeticSequence(long firstElement, long lastElement, long numberOfElements) {
        return (firstElement + lastElement) * numberOfElements / 2;
    }

}
