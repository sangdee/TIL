package lecture.binary_search;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/07
 */
public class 정렬된배열에서특정수개수구하기 {
    public static int lowerBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target)
                end = mid;
            else
                start = mid + 1;
        }
        return end;
    }

    public static int upperBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target)
                end = mid;
            else
                start = mid + 1;
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = upperBound(arr, m, 0, n) - lowerBound(arr, m, 0, n);
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
