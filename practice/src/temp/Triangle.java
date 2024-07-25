package temp;

import java.util.Arrays;

public class Triangle {
    //10, 2, 5, 1, 8, 20
    //1,2,5,8,10,20
    public static int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int last = A.length - 1;
        for (int i = last; i > 1; i--) {
            if (A[i] - A[i - 2] < A[i - 1]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 2, 5, 1, 8, 20}));
    }
}
