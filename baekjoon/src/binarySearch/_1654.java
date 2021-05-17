package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-17
 */
public class _1654 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        long max = arr[n - 1];

        long start = 1;
        long end = max;

        while (start <= end) {
            long mid = (start + end) / 2;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i] / mid;
            }

            if (sum >= m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
