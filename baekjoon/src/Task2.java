import java.util.*;

class Task2 {
    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 1};
        int[] B = {4, 2, 5, 3, 2};

        int out = solution(A, B);
        System.out.println(out);
    }
}