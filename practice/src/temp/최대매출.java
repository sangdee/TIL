package temp;

import java.util.Scanner;

public class 최대매출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        int startIndex = 0, endIndex = k;
        int sum = max;
        while (endIndex < n) {
            sum = sum - arr[startIndex++] + arr[endIndex++];
            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }
}
