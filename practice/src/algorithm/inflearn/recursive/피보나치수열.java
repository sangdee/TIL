package algorithm.inflearn.recursive;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class 피보나치수열 {
    static int[] fibo;

    private static int recursive(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = recursive(n - 2) + recursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n + 1];
        recursive(n);
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i]);
        }
    }
}
