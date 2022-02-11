package baekjoon.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/11
 */
public class 보물 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n], b = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(a, Comparator.naturalOrder());
        Arrays.sort(b, Comparator.reverseOrder());
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }
        System.out.println(result);
    }
}
