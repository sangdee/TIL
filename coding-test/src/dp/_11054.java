package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-16
 */
public class _11054 {
    //수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 >
    //SN을 만족한다면, 그 수열을 바이토닉 수열이라고 한다.
    //1 5 2 1 4 3 4 5 2 1
    //1 2 3 4

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        dp1[0] = 1;

        for (int i = 1; i < n; i++) {
            dp1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp1[i] <= dp1[j]) {
                    dp1[i] = dp1[j] + 1;
                }
            }
        }
        dp2[n - 1] = 1;
        for (int i = n - 1; i >= 0; i--) {
            dp2[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[i] > arr[j] && dp2[i] < dp2[j]+ 1) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }


        int max = 0;
        for(int i = 0; i < n; i++) {
            if(max < dp1[i] + dp2[i]) {
                max = dp1[i] + dp2[i];
            }
        }

        System.out.println(max - 1);
    }
}
