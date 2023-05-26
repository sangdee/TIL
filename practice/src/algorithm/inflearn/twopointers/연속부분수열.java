package algorithm.inflearn.twopointers;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/02
 */
public class 연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int lt = 0;
        int value = 0, count = 0;
        for (int rt = 0; rt < n; rt++) {
            value += arr[rt];
            if (value == m) {
                count++;
            }
            while (value >= m) {
                value -= arr[lt++];
                if (value == m) {
                    count++;
                }
            }
        }
        return count;
    }
}
