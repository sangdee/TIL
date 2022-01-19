import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-07 오후 3:12
 */
public class BreadthFirstSearch {
    //O(V+E) 인접리스트 (인접 행렬 사용 시 오래걸려서 사용x)
    static final int max_int = 10001;
    static int n, m, k, a, b;
    static boolean[] check = new boolean[max_int];
    static ArrayList<Integer> v[] = new ArrayList[max_int];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());//정점 수
        m = Integer.parseInt(st.nextToken());//간선 수
        k = Integer.parseInt(st.nextToken());//시작점

        for (int i = 1; i <= n; i++) {
            check[i] = false;
            v[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            v[a].add(b);
            v[b].add(a);
        }

        bfs();

        for (int i = 1; i <= n; i++) {
            System.out.println(check[i]);
        }
    }

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        check[k] = true;
        q.add(k);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int i = 0; i < v[node].size(); i++) {
                int next = v[node].get(i);

                if (check[next] == false) {
                    check[next] = true;
                    q.add(next);
                }
            }
        }
    }
}
