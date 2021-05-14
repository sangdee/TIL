package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Sangji Lee
 * @when : 2021-05-14
 * @github : http://github.com/sangdee
 */
public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] val = commands[i];
            List<Integer> list = new ArrayList<>();

            for (int j = val[0] - 1; j < val[1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            result[i] = list.get(val[2] - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }
}
