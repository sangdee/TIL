package temp;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기 {
    //1 2 4 8 9  -> 1, 4, 9
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
        int result = 0;
        Arrays.sort(arr);
        int start = 1;
        int end = Arrays.stream(arr).max().getAsInt();

        while (start <= end) {
            int mid = (start + end) / 2;

            if (count(arr, mid) >= c) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 1;
    }

    private static int count(int[] arr, int mid) {
        int count = 1;
        int point = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - point >= mid) {
                count++;
                point = arr[i];
            }
        }
        return count;
    }
}
