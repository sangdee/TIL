package DP;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-14
 */
public class _1904 {
    static int[] arr = new int[1000001];

    public static int fibo(int x) {
        if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 2;
        } else {
            if (arr[x] == 0) {
                arr[x] = fibo(x - 1) + fibo(x - 2);
            }
        }
        return arr[x]  % 15746;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*
         *  1    1
         *  2   00 11
         *  3  111 100 001
         *  4 0011 0000 1001 1100 1111
         *
         *
         * */
        System.out.println(fibo(n));
    }
}
