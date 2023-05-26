package algorithm.inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/25
 */
public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int lt = arr[n - 1];
        int rt = Arrays.stream(arr).sum();

        int result = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) > m) {
                lt = mid + 1;
            } else {
                result = mid;
                rt = mid - 1;
            }
        }
        System.out.println(result);
    }

    private static int count(int[] arr, int mid) {
        int count = 1;
        int sum = 0;
        for (int i : arr) {
            if (sum + i > mid) {
                count++;
                sum = i;
            } else {
                sum += i;
            }
        }
        return count;
    }

}
