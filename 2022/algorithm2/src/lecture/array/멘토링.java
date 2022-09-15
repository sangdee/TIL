package lecture.array;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/08/16
 */
public class 멘토링 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[m][n];

        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < n; l++) {
                        if (arr[k][l] == i) {
                            pi = l;
                        }
                        if (arr[k][l] == j) {
                            pj = l;
                        }
                    }
                    if (pi < pj) {
                        count++;
                    }
                }
                if (count == m) {
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
