import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-07 오후 6:30
 */
public class _5567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), num = 0;
        final int sang = 1;
        int[] check = new int[n + 1];
        ArrayList<Integer> v[] = new ArrayList[n + 1];
        Queue<Integer> q = new LinkedList<>();
        int friend1, friend2;

        for (int i = 1; i < n + 1; i++) {
            check[i] = 0;
            v[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            friend1 = scanner.nextInt();
            friend2 = scanner.nextInt();
            v[friend1].add(friend2);
            v[friend2].add(friend1);
        }

        check[sang] = 1;
        q.add(sang);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int next : v[node]) {
                if (check[next] == 0) {
                    check[next] = check[node] + 1;
                    q.offer(next);
                }
            }
        }
        for (int i = 2; i < n + 1; i++) {
            if (check[i] == 2 || check[i] == 3) num++;
        }
        System.out.println(num);
    }

}
