package baekjoon.greedy;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/17
 */
public class 동전0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int endIndex = n - 1, count = 0;
        while (k != 0) {
            if (k >= arr[endIndex]) {
                k -= arr[endIndex];
                count++;
            }else {
                endIndex--;
            }
        }
        System.out.println(count);
    }

}
