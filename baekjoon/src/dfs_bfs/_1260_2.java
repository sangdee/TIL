package dfs_bfs;

import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-26
 */
public class _1260_2 {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int n, m, v;
    static boolean[] bfsVisited;
    static boolean[] dfsVisited;


    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();

        bfsVisited[v] = true;
        q.offer(v);

        while (!q.isEmpty()) {
            int node = q.poll();

            System.out.print(node + " ");
            for (int i = 0; i < graph.get(node).size(); i++) {
                int y = graph.get(node).get(i);
                if (!bfsVisited[y]) {
                    q.offer(y);
                    bfsVisited[y] = true;
                }
            }
        }
    }

    public static void dfs(int v) {
        dfsVisited[v] = true;

        System.out.print(v + " ");
        for (int i = 0; i < graph.get(v).size(); i++) {
            int y = graph.get(v).get(i);
            if (!dfsVisited[y]) {
                dfs(y);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        v = scanner.nextInt();
        dfsVisited = new boolean[n + 1];
        bfsVisited = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        for (int i = 0; i < n + 1; i++) {
           Collections.sort(graph.get(i));
        }

        dfs(v);
        System.out.println();
        bfs(v);
    }

}
