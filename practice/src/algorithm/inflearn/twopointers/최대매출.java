package algorithm.inflearn.twopointers;

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
        int pointer1 = 0, pointer2 = k;
        int max = initResult(arr, pointer1, pointer2);
        int currentValue = max;

        while (pointer2 < n) {
            currentValue = currentValue - arr[pointer1++] + arr[pointer2++];
            if (max < currentValue) {
                max = currentValue;
            }
        }
        return max;
    }

    private static int initResult(int[] arr, int pointer1, int pointer2) {
        int result = 0;
        for (int i = pointer1; i < pointer2; i++) {
            result += arr[i];
        }
        return result;
    }
}
