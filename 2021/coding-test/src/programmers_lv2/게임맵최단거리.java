package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-05
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * maps	answer
 * [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]	11
 * [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	-1
 */
public class 게임맵최단거리 {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    int[][] map;

    public int solution(int[][] maps) {
        int answer = 0;
        map = maps;
        int n = map.length - 1;
        int m = map[0].length - 1;
        System.out.println(n);
        System.out.println(m);
        bfs(0, 0, n, m);

        for (int i = 0; i < maps.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
        if (map[n][m] == 1) return -1;
        return map[n][m];
    }

    private void bfs(int x, int y, int n, int m) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node node = q.poll();
            x = node.x;
            y = node.y;

            for (int k = 0; k < 4; k++) {
                int nx = dx[k] + x;
                int ny = dy[k] + y;

                if (nx >= 0 && ny >= 0 && nx <= n && ny <= m) {
                    if (map[nx][ny] == 0) continue;
                    if (map[nx][ny] == 1) {
                        map[nx][ny] = map[x][y] + 1;
                        q.offer(new Node(nx, ny));
                    }
                }
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
}
