package lecture.array;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/16
 */
public class 최대매출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp += arr[i];
        }
        int result = temp;
        for (int i = k; i < n; i++) {
            int next = temp + arr[i] - arr[i - k];
            result = Math.max(next, result);
            temp = next;
        }

        System.out.println(result);
    }
}
