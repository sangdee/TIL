package algorithm.inflearn.dfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/12
 */
public class 동전교환 {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] arr;

    private static void dfs(int l, int sum) {
        if (sum > m) {
            return;
        }
        if (l >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, l);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(l + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 동전의 종류
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 동전의 종류
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt(); // 거슬러 줄 금액
        dfs(0, 0);
        System.out.println(answer);
    }
}
