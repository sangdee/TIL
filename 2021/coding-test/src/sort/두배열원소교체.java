package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-17
 */
public class 두배열원소교체 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int[] arr1 = new int[n];
        int check = 0;
        Integer[] arr2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            for (int j = check; j < n; j++) {
                int temp = 0;
                if (arr1[i] < arr2[j]) {
                    temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                    check++;
                    break;
                }
            }
        }
        int sum = 0;
        for (int temp : arr1) {
            sum += temp;
        }

        System.out.println(sum);
    }
}
