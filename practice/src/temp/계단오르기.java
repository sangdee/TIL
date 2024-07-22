package temp;

import java.util.Scanner;

public class 계단오르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];
        solution(n, arr);
    }

    private static void solution(int n, int[] arr) {
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[n + 1]);
    }
}
