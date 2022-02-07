package lecture.greedy;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/05
 */
public class _1이될때까지 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
//25 3
        while (true) {
            int target = (n / k) * k; // 24
            result += n - target; // 1
            n = target; // 24
            if (n < k) {
                break;
            }
            result += 1;
            n /= k;
        }
        result += (n - 1);
        System.out.println(result);
    }
}
