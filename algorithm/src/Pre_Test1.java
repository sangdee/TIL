import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-09-30 오후 2:30
 */

//NHN CodingTest DFS
public class Pre_Test1 {
    private static int[] X = {-1, 0, 1, 0}; // X축의 상하좌우 이동을 위한 배열
    private static int[] Y = {0, 1, 0, -1}; // Y축의 상하좌우 이동을 위한 배열 (x,y 짝만 맞추어주면 상하좌우든 하좌우상 이든 순서 상관x)
    private static int cnt = 1;

    public static void main(String[] args) {
        int n;
        List<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] map = new int[n][n];
        boolean[][] check = new boolean[n][n];
        Pre_Test1 pre_test1 = new Pre_Test1();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 1) {
                    pre_test1.dfs(i, j, check, map);
                    arr.add(cnt);
                    cnt = 1;
                } else continue;
            }
        }
        if (arr.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(arr.size());
            for (Integer num : arr) {
                System.out.print(num + " ");
            }
        }
    }

    public void dfs(int x, int y, boolean[][] check, int[][] map) {
        check[x][y] = true;
        map[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nextX = x + X[i];
            int nextY = y + Y[i];
            if (nextX < 0 || nextY < 0 || nextX >= check.length || nextY >= check.length) {
                continue;
            }
            if (check[nextX][nextY]) {
                continue;
            }
            if (map[nextX][nextY] == 0) {
                check[nextX][nextY] = true;
                continue;
            }
            dfs(nextX, nextY, check, map);
            cnt++;

        }
    }
}
