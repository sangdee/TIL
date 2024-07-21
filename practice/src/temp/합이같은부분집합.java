package temp;

import java.util.Arrays;
import java.util.Scanner;

public class 합이같은부분집합 {
    static String result = "NO";
    static int n, total = 0;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        total = Arrays.stream(arr).sum();
        dfs(0, 0, arr);
        System.out.println(result);
    }

    private static void dfs(int level, int sum, int[] arr) {
        if (flag || sum > total / 2) {
            return;
        }
        if (level == n) {
            if (total - sum == sum) {
                result = "YES";
                flag = true;
            }
        } else {
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum, arr);
        }
    }
}
