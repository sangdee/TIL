package baekjoon.dfs_bfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/17
 */
public class DFS와BFS {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] dfsVisited, bfsVisited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertex = scanner.nextInt(), edge = scanner.nextInt(), start = scanner.nextInt();
        dfsVisited = new boolean[vertex + 1];
        bfsVisited = new boolean[vertex + 1];

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edge; i++) {
            int x = scanner.nextInt(), y = scanner.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        for (ArrayList<Integer> node : graph) {
            node.sort(Comparator.naturalOrder());
        }
        dfs(start);
        System.out.println();
        bfs(start);
    }

    private static void dfs(int start) {
        dfsVisited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < graph.get(start).size(); i++) {
            int nextNode = graph.get(start).get(i);
            if (!dfsVisited[nextNode]) {
                dfs(nextNode);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        bfsVisited[start] = true;

        while (!q.isEmpty()) {
            int poll = q.poll();
            System.out.print(poll + " ");
            for (int i = 0; i < graph.get(poll).size(); i++) {
                int nextNode = graph.get(poll).get(i);
                if (!bfsVisited[nextNode]) {
                    bfsVisited[nextNode] = true;
                    q.offer(nextNode);
                }
            }
        }
    }
}
