package algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/05
 */
public class 경로탐색 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] check;

    public void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    dfs(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        경로탐색 T = new 경로탐색();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        check = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        check[1] = 1;
        T.dfs(1);
        System.out.println(answer);
    }
}
