package dp;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-19
 */
public class _1904_2 {
    /**
     * n = 1  ,1  1
     * n = 2  ,2  00 11
     * n = 3  ,3  001 100 111
     * n = 4  ,5  0000 0011 1001 1100 1111
     * n = 5  ,8   00001 00100 10000 10011 00111 11001 11100 11111
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[] d = new BigInteger[1000001];
        d[0] = BigInteger.valueOf(0);
        d[1] = BigInteger.valueOf(1);
        d[2] = BigInteger.valueOf(2);

        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1].add(d[i - 2]).remainder(BigInteger.valueOf(15746));
        }
        System.out.println(d[n]);
    }
}
