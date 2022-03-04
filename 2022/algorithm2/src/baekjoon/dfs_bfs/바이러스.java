package baekjoon.dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/04
 */
public class 바이러스 {
    static int vertext, edge, count;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vertext = sc.nextInt();
        edge = sc.nextInt();

        visited = new boolean[vertext + 1];
        for (int i = 0; i < vertext + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edge; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        bfs(1);
        System.out.println(count);
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    count++;
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }

    }
}
