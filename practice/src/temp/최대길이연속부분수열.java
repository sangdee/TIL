package temp;

import java.util.Scanner;

/**
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * k 번을 0을 1로 변경 가능
 * 1로만 구성된 최대 길이
 */
public class 최대길이연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }

    private static int solution(int n, int k, int[] arr) {
        int max = 0, changeCount = 0;
        int startIndex = 0;
        //1 1 0 0 1 1 0 1 1 0 1 1 0 1
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                changeCount++;
            }
            while (changeCount > k) {
                if (arr[startIndex] == 0) {
                    changeCount--;
                }
                startIndex++;
            }
            max = Math.max(max, i - startIndex + 1);
        }

        return max;
    }
}
