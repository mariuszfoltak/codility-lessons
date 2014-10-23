package pl.foltak.codility.lesson1;

public class PermMissingElem {

    public int solution(int[] A) {
        int numberOfElements = A.length + 1;
        long sum = sumArithmeticSequence(1L, numberOfElements, numberOfElements);

        for (int i : A) {
            sum -= i;
        }

        return (int) sum;
    }

    private long sumArithmeticSequence(long firstElement, long lastElement, long numberOfElements) {
        return (firstElement + lastElement) * numberOfElements / 2;
    }
}
