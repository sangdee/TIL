package algorithm.inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/24
 */
public class 이분검색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 0, n - 1, m) + 1);
    }

    public static int binarySearch(int[] arr, int lt, int rt, int m) {
        if (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                return mid;
            } else if (arr[mid] < m) {
                return binarySearch(arr, mid + 1, rt, m);
            } else {
                return binarySearch(arr, lt, mid - 1, m);
            }
        }
        return -1;
    }
}
