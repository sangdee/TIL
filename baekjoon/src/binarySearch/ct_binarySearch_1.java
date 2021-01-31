package binarySearch;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-30
 */
public class ct_binarySearch_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 떡의 개수(N)와 요청한 떡의 길이(M)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 각 떡의 개별 높이 정보
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //이진 탐색을 위한 시작점과 끝점
        int start = 0;
        int end = (int) 1e9;
        //이진 탐색 수행 (반복)
        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }
            if (total < m) {
                // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
