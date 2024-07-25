package temp;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, c, arr));
    }

    private static int solution(int n, int c, int[] arr) {
        int start = 1;
        int end = Arrays.stream(arr).max().getAsInt();
        Arrays.sort(arr);
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (count(mid, arr) >= c) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private static int count(int mid, int[] arr) {
        int count = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ep + mid <= arr[i]) {
                count++;
                ep = arr[i];
            }
        }
        return count;
    }
}
