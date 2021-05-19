package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-18
 */
public class _2805 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] trees = new int[n];

        for (int i = 0; i < n; i++) {
            trees[i] = scanner.nextInt();
        }
        //10 15 17 20
        Arrays.sort(trees);

        long start = 0;
        long end = trees[n - 1];

        while (start <= end) {
            long mid = (start + end) / 2;
            long total = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    total += tree - mid;
                }
            }
            if (total < m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(end);
    }
}
