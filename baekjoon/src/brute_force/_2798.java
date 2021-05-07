package brute_force;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2021-05-07
 * @github : http://github.com/sangdee
 */
public class _2798 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (m - sum >= 0 && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
