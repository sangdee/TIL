package temp;

import java.util.Scanner;

/**
 * 약수를 1과 자기 자신만 가지는 경우
 */
public class 에라토스테네스체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int result = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 0) {
                result++;
                for (int j = i; j < n + 1; j = j + i) {
                    arr[j] = 1;
                }
            }

        }
        return result;
    }
}
