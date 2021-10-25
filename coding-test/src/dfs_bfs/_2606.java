package dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-28
 */
public class _2606 {
    public static int vertex, edge;
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vertex = scanner.nextInt();
        edge = scanner.nextInt();
        visited = new boolean[vertex + 1];

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int start) {
        visited[start] = true;
        count++;
        for (int i = 0; i < graph.get(start).size(); i++) {
            int y = graph.get(start).get(i);
            if (!visited[y]) {
                dfs(y);
            }
        }
    }
}
