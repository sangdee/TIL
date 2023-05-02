package inflearn.twopointers;

import java.util.Arrays;
import java.util.Scanner;

public class 공통원소구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        initIntArray(sc, n, arr1);
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        initIntArray(sc, m, arr2);
        solution(arr1, arr2);
    }

    private static void solution(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1] == arr2[pointer2]) {
                System.out.print(arr1[pointer1] + " ");
                pointer1++;
                pointer2++;
            } else if (arr1[pointer1] < arr2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }
    }

    private static void initIntArray(Scanner sc, int length, int[] arr) {
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
