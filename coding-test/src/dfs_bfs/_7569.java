package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-29
 */
public class _7569 {
    public static int m, n, h;
    public static int[][][] graph;
    public static int dx[] = {-1, 1, 0, 0, 0, 0};
    public static int dy[] = {0, 0, -1, 1, 0, 0};
    public static int dz[] = {0, 0, 0, 0, -1, 1};
    public static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        h = scanner.nextInt();

        graph = new int[h][n][m];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    graph[i][j][k] = scanner.nextInt();
                    if (graph[i][j][k] == 1) q.offer(new Node(i, j, k));
                }
            }
        }
        bfs();
    }

    public static void bfs() {

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < 6; i++) {
                int nz = node.z + dz[i];
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m || nz < 0 || nz >= h) continue;
                if (graph[nz][nx][ny] != 0) continue;
                if (graph[nz][nx][ny] == 0) {
                    graph[nz][nx][ny] = graph[node.getZ()][node.getX()][node.getY()] + 1;
                    q.offer(new Node(nz, nx, ny));
                }
            }
        }
        int max = graph[0][0][0];
        loop:
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (graph[i][j][k] == 0) {
                        max = -1;
                        break loop;
                    } else if (max < graph[i][j][k]) {
                        max = graph[i][j][k];
                    }
                }
            }
        }
        if (max == -1) {
            System.out.println(max);
        } else {
            System.out.println(max - 1);
        }
    }

    static class Node {
        private int x;
        private int y;
        private int z;

        public Node(int z, int x, int y) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }
    }
}
