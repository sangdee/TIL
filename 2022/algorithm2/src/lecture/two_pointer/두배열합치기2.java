package lecture.two_pointer;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/19
 */
public class 두배열합치기2 {
    public static void solution(int n, int m, int[] a, int[] b) {
        int pointer1 = 0, pointer2 = 0;
        while (pointer1 < n && pointer2 < m) {
            if (a[pointer1] < b[pointer2]) {
                System.out.print(a[pointer1++] + " ");
            } else {
                System.out.print(b[pointer2++] + " ");
            }
        }
        while (pointer1 < n) {
            System.out.print(a[pointer1++] + " ");
        }
        while (pointer2 < m) {
            System.out.print(b[pointer2++] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        solution(n, m, arr1, arr2);
    }
}
