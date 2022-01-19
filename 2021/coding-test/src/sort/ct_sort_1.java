package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-30
 */
public class ct_sort_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b, (i1, i2) -> i2 - i1);

        int tmp = 0;
        for (int i = 0; i < k; i++) {
            tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        System.out.println(sum);
    }
}
