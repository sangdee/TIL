package temp;

import java.util.Scanner;

/**
 * 앞에 숫자보다 값이 같거나 작으면 카운팅 되지 않음.
 */
public class 보이는학생 {
    public static int solution(int n, int[] arr) {
        int result = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
