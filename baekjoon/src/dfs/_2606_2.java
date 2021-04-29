package dfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-26
 */
public class _2606_2 {

    static int vertex, edge;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int result = 0;

    public static int dfs(int v) {
        visited[v] = true;
        for (int i = 0; i < graph.get(v).size(); i++) {
            int y = graph.get(v).get(i);
            if (!visited[y]){
                dfs(y);
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vertex = scanner.nextInt();
        edge = scanner.nextInt();
        visited = new boolean[vertex + 1];
        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edge; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        System.out.println(dfs(1));

    }
}
