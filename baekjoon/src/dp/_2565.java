package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-17
 */
public class _2565 {
    //    a  가 큰데  b 가 작으면
    //     a 가 작은데 b 가 크면
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[][] arr = new int[n][2];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        dp[0] = 1;
        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < dp[i]){
                max = dp[i];
            }
        }
        int result = n - max;

        System.out.println(result);
//1 8       a[1] = 1 b[1] = 8   d[1] = 1
//3 9       a[2] = 3 b[2] = 9   d[2] = 2
//2 2       a[3] = 2 b[3] = 2   d[3] = 1
//4 1       a[4] = 4 b[4] = 1   d[4] = 1
//6 4       a[5] = 6 b[5] = 4   d[5] = 2
//10 10
//9 7
//7 6
    }
}
