package algorithm.inflearn.dfs;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/11
 */
public class 중복순열 {
    static int[] pm;
    static int n, m;

    public static void dfs(int l) {
        if (l == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[l] = i;
                dfs(l + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        dfs(0);
    }
}
