package lecture.two_pointer;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/22
 */
public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        int lt = 1, count = 0, sum = 0;
        for (int rt = 1; rt <= n; rt++) {
            sum += arr[rt];
            if (sum == n) {
                count++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n && lt != n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
