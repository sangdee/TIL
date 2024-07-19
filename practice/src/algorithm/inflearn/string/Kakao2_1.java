package algorithm.inflearn.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/14
 */
public class Kakao2_1 {
    List<ArrayList<Integer>> graph;
    boolean[] visited;

    public boolean solution(int N, int[] A, int[] B) {
        graph = new ArrayList<>();
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < A.length; i++) {
            graph.get(A[i]).add(B[i]);
            graph.get(B[i]).add(A[i]);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        return dfs(1, N);
    }

    public boolean dfs(int node, int N) {
        visited[node] = true;

        if (node == N) {
            return true;
        }

        for (int i = 0; i < graph.get(node).size(); i++) {
            int next = graph.get(node).get(i);
            if (!visited[next] && next == node + 1) {
                if (dfs(next, N)) {
                    return true;
                }
            }
        }

        return false;
    }
}
