package algorithm.inflearn.dfs;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/13
 */
public class 순열구하기 {
    static int[] pm, arr;
    static int[] ch;
    static int n, m;

    public static void dfs(int l) {
        if (l == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[l] = arr[i];
                    dfs(l + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        n = 3;
        m = 2;

        arr = new int[]{3, 6, 9};
        pm = new int[m];
        ch = new int[n + 1];
        dfs(0);
    }
}
