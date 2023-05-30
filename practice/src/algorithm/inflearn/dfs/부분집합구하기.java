package algorithm.inflearn.dfs;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class 부분집합구하기 {
    static int n;
    static int[] check;

    public static void dfs(int l) {
        if (l == n + 1) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {
                    tmp.append(i).append(" ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            check[l] = 1;
            dfs(l + 1);
            check[l] = 0;
            dfs(l + 1);
        }

    }

    public static void main(String[] args) {
        n = 3;
        check = new int[n + 1];
        dfs(1);
    }
}
