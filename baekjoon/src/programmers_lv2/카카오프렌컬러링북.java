package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-01
 */

import java.util.*;

/**
 * m	n	picture	answer
 * 6	4	[
 * [1, 1, 1, 0],
 * [1, 2, 2, 0],
 * [1, 0, 0, 1],
 * [0, 0, 0, 1],
 * [0, 0, 0, 3],
 * [0, 0, 0, 3]]	[4, 5]
 */
public class 카카오프렌컬러링북 {
    static boolean[][] isVisited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static HashMap<Integer, Integer> hashMap = new HashMap<>();

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        isVisited = new boolean[m][n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !isVisited[i][j]) {
                    hashMap.put(picture[i][j], hashMap.getOrDefault(picture[i][j], 0) + 1);
                    dfs(i, j, m, n, picture);
                    list.addAll(hashMap.values());
                    hashMap.clear();
                }
            }
        }
        System.out.println(list);
        numberOfArea = list.size();
        maxSizeOfOneArea = list.stream()
                .max(Comparator.comparing(x -> x))
                .orElseThrow(NoSuchElementException::new);
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static void dfs(int x, int y, int m, int n, int[][] map) {
        isVisited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if (map[nx][ny] == map[x][y] && !isVisited[nx][ny]) {
                    hashMap.put(map[nx][ny], hashMap.getOrDefault(map[nx][ny], 0) + 1);
                    dfs(nx, ny, m, n, map);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 3, new int[][]{{0, 1, 0}, {1, 1, 0}, {0, 0, 0}})));
    }
}
