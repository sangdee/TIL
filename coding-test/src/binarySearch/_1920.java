package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-17
 */
public class _1920 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = scanner.nextInt();
        }
        Arrays.sort(nArr);

        int m = scanner.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = scanner.nextInt();
        }

        for (int i : mArr) {
            int result = Arrays.binarySearch(nArr, i);
            if (result < 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
//            int result = binarySearch(nArr, i, 0, n - 1);
//            if (result == -1) {
//                System.out.println(0);
//            } else {
//                System.out.println(1);
//            }

        }
    }

//    public static int binarySearch(int[] arr, int target, int start, int end) {
//        if (start > end) return -1;
//        int mid = (start + end) / 2;
//
//        if (arr[mid] == target) return mid;
//        else if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
//        else return binarySearch(arr, target, mid + 1, end);
//    }
}
