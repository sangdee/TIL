package temp;

import java.util.Scanner;

public class 미로탐색 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int result = 0;
    static int[][] arr = new int[8][8];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        arr[1][1] = 1;
        dfs(1, 1);
        System.out.println(result);

    }

    private static void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            result++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    dfs(nx, ny);
                    arr[nx][ny] = 0;
                }
            }
        }

    }


}
