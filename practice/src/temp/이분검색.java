package temp;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(n, m, arr);
    }

    private static void solution(int n, int m, int[] arr) {
        Arrays.sort(arr);

        int mid = n / 2, startIndex = 0, endIndex = n;
        while (true) {
            if (arr[mid] < m) {
                startIndex = mid + 1;
                mid = (startIndex + endIndex) / 2;
            } else if (arr[mid] > m) {
                endIndex = mid - 1;
                mid = (startIndex + endIndex) / 2;
            } else {
                System.out.println(mid + 1);
                break;
            }
        }


    }
}
