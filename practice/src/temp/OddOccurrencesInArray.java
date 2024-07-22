package temp;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Arrays.sort(A);
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                result += A[i];
            } else {
                result -= A[i];
            }
        }
        return result;
    }
}
