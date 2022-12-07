package lecture.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/12/07
 * 이분탐색
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
        int lt = 0, rt = arr.length - 1;
        while (true) {
            int mid = (lt + rt) / 2;
            if (arr[mid] < m) {
                lt = mid + 1;
            } else if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                System.out.println(mid + 1);
                break;
            }
        }
    }
}
