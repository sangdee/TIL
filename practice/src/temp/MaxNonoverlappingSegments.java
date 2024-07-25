package temp;

public class MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {
        // Implement your solution
        if (A.length <= 1) {
            return A.length;
        }
        int result = 1;
        int start = 0;
        for (int i = 0; i < A.length; i++) {

            if (B[start] < A[i]) {
                start = i;
                result++;
            }
        }
        return result;
    }

}
