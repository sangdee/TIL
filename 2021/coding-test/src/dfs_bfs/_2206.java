package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-29
 */
public class _2206 {
    static class Node {
        private int x;
        private int y;
        private int distance;
        private int jump;

        public Node(int x, int y, int distance, int jump) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.jump = jump;
        }
    }

    static int n, m, ans;
    static int[][] map;
    static int[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        map = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j) - '0';
                visited[i][j] = Integer.MAX_VALUE;
            }
        }
        ans = Integer.MAX_VALUE;
        bfs(0, 0);

        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }

    public static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y, 1, 0));
        visited[x][y] = 0;

        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.x == n - 1 && node.y == m - 1) {
                ans = node.distance;
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                if (visited[nx][ny] <= node.jump) continue;

                if (map[nx][ny] == 0) { //벽이 아닐 때
                    visited[nx][ny] = node.jump;
                    q.offer(new Node(nx, ny, node.distance + 1, node.jump));
                } else {// 벽일 때
                    if (node.jump == 0) {
                        visited[nx][ny] = node.jump + 1;
                        q.offer(new Node(nx, ny, node.distance + 1, node.jump + 1));
                    }
                }
            }
        }
    }
}