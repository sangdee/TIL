package algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/10
 */
public class 바둑이승차 {
    static int c, n, answer = Integer.MIN_VALUE;

    private static void dfs(int l, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (l == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(l + 1, sum + arr[l], arr);
            dfs(l + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            arr[i] = w;
        }
        dfs(0, 0, arr);
        System.out.println(answer);
    }
}
