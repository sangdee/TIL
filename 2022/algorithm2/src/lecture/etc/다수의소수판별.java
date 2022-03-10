package lecture.etc;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/10
 */
//에라토스테네스의 체 알고리즘 (특정 범위안의 소수판별)
public class 다수의소수판별 {
    public static int n = 1000;
    public static boolean[] arr = new boolean[n + 1];

    public static void main(String[] args) {
        Arrays.fill(arr, true);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == true) {
                int j = 2;
                while (i * j <= n) {
                    arr[i * j] = false;
                    j += 1;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }
    }
}
