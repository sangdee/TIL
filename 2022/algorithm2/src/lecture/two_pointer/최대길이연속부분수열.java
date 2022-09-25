package lecture.two_pointer;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/24
 */

import java.util.Scanner;

/**
 * N + 1번째 0이 나올때 까지 길이를 더하고, N+1번째 0이 나오면 첫번째 0 다음 칸으로 left pointer를 이동
 * O(N)
 * lt, count, result
 */
public class 최대길이연속부분수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
}
