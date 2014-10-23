package pl.foltak.codility.lesson1;

public class TapeEquilibrium {

    public int solution(int[] A) {
        int firstTapeSum = A[0];
        int nextTapeSum = obliczSume(A);

        int min = Math.abs(firstTapeSum - nextTapeSum);
        for (int i = 1; i < A.length - 1; i++) {
            firstTapeSum += A[i];
            nextTapeSum -= A[i];
            int currentMin = Math.abs(firstTapeSum - nextTapeSum);
            if (currentMin < min) {
                min = currentMin;
            }
        }

        return min;
    }

    private int obliczSume(int[] tape) {
        int sum = 0;
        for (int i = 1; i < tape.length; i++) {
            sum += tape[i];
        }
        return sum;
    }
    
}
