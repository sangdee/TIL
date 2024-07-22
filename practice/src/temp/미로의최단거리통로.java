package temp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의최단거리통로 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr = new int[8][8];
    static int[][] dis = new int[8][8];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        bfs(new Node(1, 1));
        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }

    }

    private static void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        arr[node.getX()][node.getY()] = 1;
        while (!q.isEmpty()) {
            Node poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.getX() + dx[i];
                int ny = poll.getY() + dy[i];

                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    q.offer(new Node(nx, ny));
                    dis[nx][ny] = dis[poll.getX()][poll.getY()] + 1;
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
