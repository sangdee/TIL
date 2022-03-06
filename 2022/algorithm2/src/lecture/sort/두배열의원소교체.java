package lecture.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/06
 */
public class 두배열의원소교체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];
        for (int i = 0; i < n; i++) {
            A[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i]= sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B, Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            if (A[i] < B[i]) {
                A[i] = B[i];
            }else {
                break;
            }
        }
        System.out.println(Arrays
            .stream(A)
            .reduce(0, Integer::sum));
    }
}
