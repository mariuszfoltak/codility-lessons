package pl.foltak.codility.lesson2;

public class PermCheck {

    public int solution(int[] A) {
        boolean[] nums = new boolean[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= A.length) {
                nums[A[i] - 1] = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!nums[i]) {
                return 0;
            }
        }
        return 1;
    }
}
