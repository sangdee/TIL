package lecture.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/05
 */
public class 모험가길드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += 1;
            if (count >= arr[i]) {
                result += 1;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
