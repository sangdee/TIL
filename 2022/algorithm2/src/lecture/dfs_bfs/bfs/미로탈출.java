package lecture.dfs_bfs.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/18
 */
public class 미로탈출 {

    static int[][] map;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) - '0' == 0) {
                    map[i][j] = -1;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        bfs(0, 0);
        System.out.println(map[n - 1][m - 1]);
    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        q.add(new Node(x, y));

        while (!q.isEmpty()) {
            Node poll = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll.getX() + dx[i];
                int ny = poll.getY() + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (map[nx][ny] == -1) {
                        continue;
                    }
                    if (map[nx][ny] == 0) {
                        map[nx][ny] = map[poll.getX()][poll.getY()] + 1;

                        q.add(new Node(nx, ny));

                    }
                }
            }
        }
    }
}

class Node {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
