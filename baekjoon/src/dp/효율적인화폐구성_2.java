package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-18
 */
public class 효율적인화폐구성_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), m = scanner.nextInt();
        int[] money = new int[n];

        for (int i = 0; i < n; i++) {
            money[i] = scanner.nextInt();
        }

        int[] d = new int[m + 1];

        Arrays.fill(d, 10001);
        d[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = money[i]; j <= m; j++) {
                if (d[j - money[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - money[i]] + 1);
                }
            }
        }
        if (d[m] == 10001) System.out.println(-1);
        else System.out.println(d[m]);

    }
}
