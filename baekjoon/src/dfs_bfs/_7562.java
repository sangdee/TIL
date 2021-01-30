package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-30
 */
public class _7562 {
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int testCase, l, result;
    public static int[][] map;
    public static boolean[][] visited;
    public static int[] dx = {-1, 1, -1, 1, -2, 2, -2, 2};
    public static int[] dy = {-2, 2, 2, -2, -1, 1, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {

            l = scanner.nextInt();
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();

            map = new int[l][l];
            visited = new boolean[l][l];
            bfs(startX, startY, endX, endY);
            System.out.println(map[endX][endY]);
        }
    }

    public static void bfs(int x, int y, int endX, int endY) {
        Queue<Node> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node.x == endX && node.y == endY) {
                break;
            }
            for (int i = 0; i < 8; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (nx >= 0 && nx < l && ny >= 0 && ny < l && !visited[nx][ny]) {
                    q.offer(new Node(nx, ny));
                    visited[nx][ny] = true;
                    map[nx][ny] = map[node.x][node.y] + 1;
                }
            }
        }
    }
}
