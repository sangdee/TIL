package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-17
 */
public class _9251 {
    //    LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때,
    //    모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.
    //    예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.
    //          ACAYKP
    //          CAPCAK
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        char[] arr1 = new char[s1.length()];
        char[] arr2 = new char[s2.length()];

        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i < s1.length(); i++) {
            arr1[i] = s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            arr2[i] = s2.charAt(i);
        }

        for (int i = 1; i <= arr1.length; i++) {
            for (int j = 1; j <= arr2.length; j++) {

                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[arr1.length][arr2.length]);
    }
}
