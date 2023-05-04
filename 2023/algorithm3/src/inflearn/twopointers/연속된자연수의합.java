package inflearn.twopointers;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/04
 */
public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int checkSize = (int)Math.ceil((double)n / 2);
        int[] arr = new int[checkSize];
        for (int i = 0; i < checkSize; i++) {
            arr[i] = i + 1;
        }
        int leftPointer = 0, sum = 0, count = 0;
        for (int rightPointer = 0; rightPointer < checkSize; rightPointer++) {
            sum += arr[rightPointer];
            if (sum == n) {
                count++;
            }
            while (sum >= n) {
                sum -= arr[leftPointer++];
                if (sum == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
