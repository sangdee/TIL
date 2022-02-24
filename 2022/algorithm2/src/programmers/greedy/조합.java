package programmers.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/24
 */
public class 조합 {
    static ArrayList<ArrayList<ArrayList<Integer>>> resultList = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 1; i <= n; i++) {

            System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
            combination(arr, visited, 0, n, i);
        }
        System.out.println(resultList);
    }

    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            resultList.add(new ArrayList<ArrayList<Integer>>());
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                resultList.get(count).add(new ArrayList<>(List.of(arr[i])));
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        count++;
    }
}
