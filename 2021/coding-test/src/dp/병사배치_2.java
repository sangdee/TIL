package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-19
 */
public class 병사배치_2 {
    //LIS
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        int[] dp = new int[2001];

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        Collections.reverse(arr);
        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i : dp) {
            max = Math.max(max, i);
        }

        System.out.println(n - max);
    }
}
