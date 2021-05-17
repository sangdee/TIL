package binarySearch;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-17
 */
public class 정렬된배열에서특정수개수구하기 {
    /**
     * 문제
     * 1 1 2 2 2 2 3 3 4 같은 정렬된 배열이 주어졌을 떄 2의 개수를 찾아라
     * 시간 복잡도 Log N 이어야만 함
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = countByRange(arr, x, x);

        if (count == 0) System.out.println(-1);
        else System.out.println(count);
    }

    public static int countByRange(int[] arr, int leftValue, int rightValue) {
        int rightIndex = upperBound(arr, rightValue, 0, arr.length);
        int leftIndex = lowerBound(arr, leftValue, 0, arr.length);

        return rightIndex - leftIndex;
    }

    private static int upperBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    private static int lowerBound(int[] arr, int target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
