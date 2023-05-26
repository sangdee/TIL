package algorithm.inflearn.twopointers;

import java.util.Scanner;

public class 두배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        initArray(sc, n, arr1);
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        initArray(sc, m, arr2);
        solution(arr1, arr2);

    }

    private static void solution(int[] arr1, int[] arr2) {
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1] < arr2[pointer2]) {
                System.out.print(arr1[pointer1++] + " ");
            } else {
                System.out.print(arr2[pointer2++] + " ");
            }
        }
        if (pointer1 < arr1.length) {
            for (int i = pointer1; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        } else {
            for (int i = pointer2; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }

    private static void initArray(Scanner sc, int length, int[] arr) {
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
