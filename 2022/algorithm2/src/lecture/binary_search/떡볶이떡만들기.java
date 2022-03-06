package lecture.binary_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/07
 */
public class 떡볶이떡만들기 {
    static int result;
    public static void main(String[] args) {
        System.out.println(1e9);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(binarySearch(arr, m, 0, Arrays.stream(arr).max().getAsInt()));

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end)
            return result;

        int leftOverCake = 0;
        for (int i = 0; i < arr.length; i++) {
            int valeOfOne = arr[i] - mid;
            if (valeOfOne> 0){
                leftOverCake += valeOfOne;
            }
        }
        if (leftOverCake == target) {
            return mid;
        } else if (leftOverCake > target) {
            result = mid;
            return binarySearch(arr, target, mid + 1, end);
        } else {
            return binarySearch(arr, target, start, mid - 1);
        }

    }
}
