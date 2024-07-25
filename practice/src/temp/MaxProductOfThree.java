package temp;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int n = A.length - 1;

        int max = Integer.MIN_VALUE;
        if (A[0] * A[1] * A[n] > max) {
            max = A[0] * A[1] * A[n];
        }
        if (A[n - 2] * A[n - 1] * A[n] > max) {
            max = A[n - 2] * A[n - 1] * A[n];
        }
        return max;
    }
}
