package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-19
 */
public class _1003_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int t = 0; t < testCase; t++) {
            int n = scanner.nextInt();

            int[][] arr = new int[41][2];

            arr[0][0] = 1;
            arr[1][1] = 1;

            for (int i = 2; i <= 40; i++) {
                arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
                arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
            }
            System.out.println(arr[n][0] + " " + arr[n][1]);
        }
    }
}
