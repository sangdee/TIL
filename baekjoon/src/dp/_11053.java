package dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-16
 */
public class _11053 {

    // 문제
    //수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
    //
    //예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
    //
    //입력
    //첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
    //
    //둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int D[] = new int[n];
        D[0] = 1;

        for (int i = 1; i < n; i++) {
            D[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && D[i] <= D[j]) {
                    D[i] = D[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max  < D[i]){
                max = D[i];
            }
        }
        System.out.println(max);
    }
}
