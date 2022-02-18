package lecture.dfs_bfs.dfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/18
 */
public class 음료수얼려먹기 {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int row, column;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        map = new int[row][column];
        visited = new boolean[row][column];
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < row; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < column; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (!visited[i][j]) {
                    bfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    private static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Node poll = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll.getX() + dx[i];
                int ny = poll.getY() + dy[i];

                if (nx >= 0 && nx < row && ny >= 0 && ny < column) {
                    if (map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                    }
                    if (!visited[nx][ny]) {
                        q.add(new Node(nx, ny));
                        visited[nx][ny] = true;
                    }
                }
            }
        }

    }

    static class Node {

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
}
