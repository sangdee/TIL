package teamnote;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-26
 */
public class Bfs {
    public static int n, m;
    public static int[][] graph;

    public static int bfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx > -1 && nx <= n && ny > -1 && ny <= m) {
                    if (graph[nx][ny] == 0) continue;

                    if (graph[nx][ny] == 1) {
                        graph[nx][ny] = graph[x][y] + 1;

                        q.offer(new Node(nx, ny));
                    }
                }
            }
        }
        return graph[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        graph = new int[201][7];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0, 0));

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }

    }
}

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
