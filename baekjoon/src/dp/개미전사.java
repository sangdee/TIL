package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-31
 */
public class 개미전사 {

    public static int[] d = new int[100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] k = new int[n];
        for (int i = 0; i < n; i++) {
            k[i] = scanner.nextInt();
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 2; j < n; j++) {
//                d[i + j] = k[i] + k[j];
//            }
//        }
//        int v = Arrays.stream(d)
//                .max()
//                .getAsInt();
//
//        System.out.println(v);

        d[0] = k[0];
        d[1] = Math.max(k[0], k[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + k[i]);
        }
        System.out.println(d[n - 1]);
    }

}
