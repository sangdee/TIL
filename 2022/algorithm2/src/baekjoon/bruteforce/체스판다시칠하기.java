package baekjoon.bruteforce;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/25
 */
public class 체스판다시칠하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        boolean[][] arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
        String s = scanner.next();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'W') {
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }
        int row = n - 7;
        int col = n - 7;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

            }
        }
    }
}
