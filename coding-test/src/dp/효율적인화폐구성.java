package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-13
 */
public class 효율적인화폐구성 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] d = new int[m + 1];
        Arrays.fill(d, 10001);
        d[0] = 0;
        for (int i = 0; i < n; i++) {//화폐단위
            for (int j = arr[i]; j <= m; j++) { // 금액
                if (d[j - arr[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
                }
            }
        }
        if (d[m] == 10001) System.out.println(-1);
        else System.out.println(d[m]);
    }
}
