package dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-30
 */
public class _1707 {
    public static int v, e;
    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> graph;
    public static String ans;

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < v + 1; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                q.offer(i);
            }

            while (!q.isEmpty()) {
                int node = q.poll();

                for (int j = 0; j < graph.get(node).size(); j++) {
                    int y = graph.get(node).get(j);
                    if (visited[y] == 0) {
                        q.offer(y);
                        visited[y] = visited[node] * -1;
                    }
                    if (visited[y] == visited[node]) {
                        ans = "NO";
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int t = 0; t < testCase; t++) {
            v = scanner.nextInt();
            e = scanner.nextInt();
            graph = new ArrayList<>();
            for (int i = 0; i < v + 1; i++) {
                graph.add(new ArrayList<>());
            }
            ans = "YES";
            visited = new int[v + 1];
            for (int i = 0; i < e; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            bfs();
            System.out.println(ans);
        }
    }
}
