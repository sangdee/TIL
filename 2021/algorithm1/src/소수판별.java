import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-19
 */

//에라토스테네스의 체
public class 소수판별 {
    public static int n = 1000;
    public static boolean[] arr = new boolean[n + 1];

    public static void main(String[] args) {
        Arrays.fill(arr, true);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == true) {
                int j = 2;
                while (i * j <= n) {
                    arr[i * j] = false;
                    j++;
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }

}
