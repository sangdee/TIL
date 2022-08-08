package lecture.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/08/08
 */
public class 임시반장정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int[][] arr = new int[nextInt][5];
        for (int i = 0; i < nextInt; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0, result = 0;
        for (int i = 0; i < nextInt; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < nextInt; j++) {
                for (int k = 0; k < 5; k++) {
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
        System.out.println(result + 1);
    }
}
