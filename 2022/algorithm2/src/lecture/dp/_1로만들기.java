package lecture.dp;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/20
 */
public class _1로만들기 {

    public static int d[] = new int[30001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 2; i <= x; i++) {
            d[i] = d[i - 1] + 1;

            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
            if (i % 3 == 0) {
                d[i] = Math.max(d[i], d[i / 3] + 1);
            }
            if (i % 5 == 0) {
                d[i] = Math.max(d[i], d[i / 5] + 1);
            }
        }
        System.out.println(d[x]);
    }
}
