package algorithm.inflearn.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/23
 */
public class 장난꾸러기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] clone = arr.clone();
        Arrays.sort(clone);
        for (int i = 0; i < n; i++) {
            if (arr[i] != clone[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
