package pl.foltak.codility.lesson2;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        final int[] counters = new int[N];
        int currentMaxValue = 0;
        int lastMaxValue = 0;
        int maxCounterOperation = N + 1;
        int value;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxCounterOperation) {
                lastMaxValue = currentMaxValue;
            } else {
                value = counters[A[i] - 1];
                if (value < lastMaxValue) {
                    value = lastMaxValue + 1;
                } else {
                    value++;
                }
                if (currentMaxValue < value) {
                    currentMaxValue = value;
                }
                counters[A[i] - 1] = value;
            }
        }
        
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastMaxValue) {
                counters[i] = lastMaxValue;
            }
        }
        
        return counters;
    }
}
