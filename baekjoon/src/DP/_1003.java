package DP;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-13
 */
public class _1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] f = new int[41][2];
        f[0][0] = 1;
        f[1][1] = 1;
        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                f[i][j] = f[i - 1][j] + f[i - 2][j];
            }
        }
        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            System.out.println(f[a][0] + " " + f[a][1]);
        }
    }
}
