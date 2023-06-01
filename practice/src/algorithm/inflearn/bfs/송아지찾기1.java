package algorithm.inflearn.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class 송아지찾기1 {
    int[] dis = {1, -1, 5};
    int[] check;
    Queue<Integer> q = new LinkedList<>();

    private int bfs(int s, int e) {
        check = new int[10001];
        check[s] = 1;
        q.offer(s);
        int level = 0;
        while (!q.isEmpty()) {
            int length = q.size();
            for (int i = 0; i < length; i++) {
                int x = q.poll();
                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == e) {
                        return level + 1;
                    }
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        송아지찾기1 t = new 송아지찾기1();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(t.bfs(s, e));
    }
}
