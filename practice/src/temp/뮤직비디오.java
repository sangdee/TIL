package temp;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int result = 0;
        int start = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();
        while (start <= end) {
            int mid = (start + end) / 2;
            if (getAlbumCount(arr, mid) <= m) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    private static int getAlbumCount(int[] arr, int mid) {
        int sum = 0, count = 1;
        for (int i : arr) {
            if (sum + i > mid) {
                sum = i;
                count++;
            } else {
                sum = sum + i;
            }
        }
        return count;
    }
}
