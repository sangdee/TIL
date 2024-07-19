package temp;

import java.util.Scanner;

/**
 * 항상 다른 수 보다 앞에 있어야 매칭 가능
 * 1:1로 비교해서 각 시험마다 앞에 있는지 모두 체크 해야함.
 */
public class 멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[][] arr) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) {
                    int positionI = 0;
                    int positionJ = 0;
                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) {
                            positionI = l;
                        }
                        if (arr[k][l] == j) {
                            positionJ = l;
                        }
                    }
                    if (positionI < positionJ) {
                        count++;
                    }
                }
                if (count == m) {
                    result++;
                }
            }
        }
        return result;
    }
}
