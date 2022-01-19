package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-29
 */
public class _1697 {
    static int n, k;
    static int visited[] = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        bfs();
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();

        q.offer(n);
        visited[n] = 1;

        while (!q.isEmpty()) {
            n = q.poll();

            if (n == k) break;

            if (n + 1 <= 100000 && visited[n + 1] == 0) {
                q.offer(n + 1);
                visited[n + 1] = visited[n] + 1;
            }
            if (n - 1 >= 0 && visited[n - 1] == 0) {
                q.offer(n - 1);
                visited[n - 1] = visited[n] + 1;
            }
            if (n * 2 <= 100000 && visited[n * 2] == 0) {
                q.offer(n * 2);
                visited[n * 2] = visited[n] + 1;
            }
        }
        System.out.println(visited[k] - 1);

    }
}
