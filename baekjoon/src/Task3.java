import java.util.ArrayList;

public class Task3 {

    static int solution(int[] A) {
        int n = A.length;
        ArrayList<Integer> sums = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] >= 0) {
                sum += A[i];
            }

            if (i == n-1 || A[i] < 0) {
                sums.add(sum);
                sum = 0;
            }
        }

        int max = 0;
        for(int s : sums){
            if (s > max){
                max = s;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {-1, 2, 1, 2, 0, 2, 1, -3, 4, 3, 0, -1};
        int[] B = {-8, 3, 0, 5, -3, 12};
        int[] C = {1, 2, -3, 4, 5, -6};
        int[] D = {1, 2, -3, 4, 0, 50, -6};
        int[] E = {-1, 2, -3, 4, -5, -6};

        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(E));
    }
}
