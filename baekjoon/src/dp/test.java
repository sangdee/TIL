package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-14
 */
public class test {
    static int[] array = new int[41];

    static int fibo(int n) {
        if (n == 0) array[0] = 0;
        else if (n == 1) array[1] = 1;
        else {
            if (array[n] == 0) {
                array[n] = fibo(n - 1) + fibo(n - 2);
            }
        }
        return array[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTestCase = sc.nextInt();

        for (int i = 0; i < numTestCase; i++) {
            int n = sc.nextInt();

            if (n == 0){
                System.out.println("1 0");
            }else if(n == 1){
                System.out.println("0 1");
            }else{
                int f1 = fibo(n-1);
                int f2 = fibo(n);
                System.out.println(f1 + " " + f2);
            }
        }

        fibo(3);

        // 0 -> 1 0
        // 1 -> 0 1
        // 2 -> 1 1
        // 3 -> 1 2
        // 4 -> 2 3
        // 5 -> 3 5
        // 6 -> 5 8

        // n -> fibo(n-1) + fibo(n)
        // n > 0
    }
}
