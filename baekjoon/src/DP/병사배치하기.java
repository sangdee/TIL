package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-13
 */
public class 병사배치하기 {
    static int n;
    static ArrayList<Integer> v = new ArrayList<>();
    static int[] dp = new int[2000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            v.add(scanner.nextInt());
        }
        Collections.reverse(v);

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (v.get(j) < v.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }
        System.out.println(n - maxValue);
//        int n = scanner.nextInt();
//        int[] d = new int[n];
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 1; i < n; i++) {
//            if (arr[i - 1] < arr[i]) {
//                d[i] = d[i - 1] + 1;
//            } else {
//                d[i] = d[i - 1];
//            }
//        }
//        System.out.println(d[n - 1]);
    }
}
