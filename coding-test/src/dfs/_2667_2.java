package dfs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-26
 */
public class _2667_2 {
    static int n;
    static int[][] map;
    static int[] num = new int[25 * 25];
    static boolean[][] visited = new boolean[25][25];
    static int result = 0;
    private static int dx[] = {1, -1, 0, 0};
    private static int dy[] = {0, 0, 1, -1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        num[result]++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    result++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(result);
        Arrays.sort(num);
        for (int i : num) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
