package lecture.array;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/08/07
 */
public class 격자판최대합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int[][] arr = new int[nextInt][nextInt];
        for (int i = 0; i < nextInt; i++) {
            for (int j = 0; j < nextInt; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < nextInt; i++) {
            int tmp = 0;
            for (int j = 0; j < nextInt; j++) {
                tmp += arr[i][j];
                if (max < tmp) {
                    max = tmp;
                }
            }
            tmp = 0;
            for (int j = 0; j < nextInt; j++) {
                tmp += arr[j][i];
                if (max < tmp) {
                    max = tmp;
                }
            }
        }

        int tmp = 0, tmp2 = 0;
        for (int i = 0; i < nextInt; i++) {
            tmp += arr[i][i];
        }
        for (int i = 0; i < nextInt; i++) {
            tmp2 += arr[i][nextInt - 1 - i];
        }

        System.out.println(Math.max(max, Math.max(tmp, tmp2)));
    }
}
