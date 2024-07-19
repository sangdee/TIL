package algorithm.inflearn.string;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/14
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * 1부터n까지 번호가 매겨진 n개의 정점과 m개의 간선으로 구성된 무방향 그래프가 주어진다 이 그래프는 길이가 m인 두개의 배열a와b로 나타낼수있다. k가 0에서 m-1까지일때 k에 대한 쌍(a[k],b[k])은 정점 a[k]와 정점b[k]사이의 간선을 나타낸다.
 * 주어진 그래프에 정점1부터 정점n까지 모든 정점을 하나씩 오름차순으로 통과하는 경로가 있는지 확인하시오. 경로위의 모든길은 직접 연결되어야한다 .
 * public boolean solution(int N, int[] A, int[] B) {
 * // Implement your solution here
 * }함수를 작성하시오 정수n과 각각 정수m으로 구성된 두개의 배열 a와b가 주어졌을때 정점1부터 n까지 모든 정점을 하나씩 오름차순으로 통과하는 경로가 존재하면 true를 반환하고 그렇지 않으면 false를 반환해야한다
 */
public class Kakao2 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        int[] A = {1, 2, 4, 4, 3};
        int[] B = {2, 3, 1, 3, 1};
        int N = 4;

        System.out.println(solution(N, A, B));
    }

    public static boolean solution(int N, int[] A, int[] B) {
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < A.length; i++) {
            graph[A[i]].add(B[i]);
            graph[B[i]].add(A[i]);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        return dfs(1, N);
    }

    public static boolean dfs(int node, int N) {
        visited[node] = true;

        if (node == N) {
            return true;
        }

        for (int i = 0; i < graph[node].size(); i++) {
            int next = graph[node].get(i);
            if (!visited[next] && next == node + 1) {
                if (dfs(next, N)) {
                    return true;
                }
            }
        }

        return false;
    }
}
