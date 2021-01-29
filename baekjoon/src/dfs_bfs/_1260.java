package dfs_bfs;

import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-28
 */
public class _1260 {
    public static int vertex, edge, start;
    public static boolean[] dfsVisited, bfsVisited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vertex = scanner.nextInt();
        edge = scanner.nextInt();
        start = scanner.nextInt();
        dfsVisited = new boolean[vertex + 1];
        bfsVisited = new boolean[vertex + 1];

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < edge; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for (int i = 0; i < vertex + 1; i++) {
            Collections.sort(graph.get(i));
        }
        dfs(start);
        System.out.println("");
        bfs(start);
    }

    public static void dfs(int start) {
        dfsVisited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < graph.get(start).size(); i++) {
            int y = graph.get(start).get(i);
            if (!dfsVisited[y]) dfs(y);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        bfsVisited[start] = true;
        while (!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!bfsVisited[y]) {
                    q.offer(y);
                    bfsVisited[y] = true;
                }
            }
        }

    }


}
