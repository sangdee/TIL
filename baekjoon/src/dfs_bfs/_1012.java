package dfs_bfs;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-28
 */
public class _1012 {
    private static int dx[] = {0, 0, 1, -1};
    private static int dy[] = {1, -1, 0, 0};
    private static int vertex;
    private static int bugsNum;
    private static boolean[][] visited;
    private static int[][] map;
    private static int m;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int l = 0; l < t; l++) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            map = new int[m][n];
            visited = new boolean[m][n];
            vertex = scanner.nextInt();
            bugsNum = 0;

            for (int i = 0; i < vertex; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                map[x][y] = 1;
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        bugsNum++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(bugsNum);
        }
    }

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
}
