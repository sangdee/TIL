package lecture.array;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/08/08
 */
public class 봉우리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int[][] arr = new int[nextInt][nextInt];

        for (int i = 0; i < nextInt; i++) {
            for (int j = 0; j < nextInt; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int count = 0;
        for (int i = 0; i < nextInt; i++) {
            for (int j = 0; j < nextInt; j++) {
//                int checkCount = 0;
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < nextInt && ny >= 0 && ny < nextInt) {
                        if (arr[i][j] <= arr[nx][ny]) {
                            flag =false;
                            break;
                        }
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
