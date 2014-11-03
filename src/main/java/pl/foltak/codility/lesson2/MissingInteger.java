package pl.foltak.codility.lesson2;

public class MissingInteger {

    public int solution(int[] A) {
        int max = A.length + 1;
        boolean[] integers = new boolean[max];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] < max) {
                integers[A[i] - 1] = true;
            }
        }

        for (int i = 0; i < integers.length; i++) {
            if (!integers[i]) {
                return i + 1;
            }
        }
        return -1;
    }

}
