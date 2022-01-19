package dp;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-13
 */
public class fibonacciTD {
    static long[] d = new long[101];

    public static long fibo(int n) {
        if (n <= 1)
            return n;
        else if (n == 2)
            return 1;
        else {
            if (d[n] > 0)
                return d[n];
            d[n] = fibo(n-1) + fibo(n-2);
            return d[n];
        }
    }

    public static void main(String[] args) {
        Arrays.fill(d, -1);
        System.out.println(fibo(50));
    }

}
