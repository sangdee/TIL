package temp;

public class NumberSolitaire {
    public static int solution(int[] A) {
        // Implement your solution here
        int[] dy = new int[A.length];
        dy[0] = A[0];
        dy[1] = A[0] + A[1];

        for (int i = 2; i < A.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 6; j >= 1; j--) {
                if (i - j >= 0) {
                    max = Math.max(max, dy[i - j]);
                }
            }
            dy[i] = max + A[i];
        }
        return dy[A.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, -2, 0, 9, -1, -2}));
    }

}
