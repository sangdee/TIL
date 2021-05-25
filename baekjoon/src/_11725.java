import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-25
 */
public class _11725 {
    static ArrayList<ArrayList<Integer>> tree;
    static boolean visit[];
    static int parent[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        tree = new ArrayList<>();
        visit = new boolean[n + 1];
        parent = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            tree.get(x).add(y);
            tree.get(y).add(x);
        }
        System.out.println(tree);
        visit[1] = true;
        dfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int x) {
        for (int i : tree.get(x)) {
            if (!visit[i]) {
                parent[i] = x;
                visit[i] = true;
                dfs(i);
            }
        }
    }
}
