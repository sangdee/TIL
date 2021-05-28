package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * array	commands	return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 */
public class k번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            result[i] = list.get(commands[i][2] - 1);
        }
        return result;
    }
}
