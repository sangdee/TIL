package dp;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-13
 */
public class fibonacciBU {
    public static long[] d = new long[100];

    public static void main(String[] args) {

        d[1] = 1;
        d[2] = 1;
        int n = 50;

        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);
    }
}
