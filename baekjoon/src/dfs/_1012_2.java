package dfs;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-29
 */
public class _1012_2 {
    private static int dx[] = {0, 0, 1, -1};
    private static int dy[] = {1, -1, 0, 0};
    private static boolean[][] visited;
    private static int[][] map;
    private static int n, m, k;

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            k = scanner.nextInt();

            visited = new boolean[m][n];
            map = new int[m][n];
            int bugCount = 0;


            for (int j = 0; j < k; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                map[x][y] = 1;
            }

            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if (map[j][l] == 1 && !visited[j][l]) {
                        bugCount++;
                        dfs(j, l);
                    }
                }
            }
            System.out.println(bugCount);
        }
    }
}
