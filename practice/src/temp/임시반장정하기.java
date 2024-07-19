package temp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 한 사람당 몇명과 같은 반이었는지 구하기
 * 1번부터 n번까지 전부다 구해본다
 */
public class 임시반장정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0, max = 0;
        for (int i = 1; i < n + 1; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 1; j < n + 1; j++) {
                for (int k = 1; k < 6; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        set.add(j);
                    }
                }
            }
            if (max < set.size()) {
                max = set.size();
                result = i;
            }
        }
        System.out.println(result);
    }
}
