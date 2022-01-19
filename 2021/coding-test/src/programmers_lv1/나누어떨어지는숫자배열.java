package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * arr	divisor	return
 * [5, 9, 7, 10]	5	[5, 10]
 * [2, 36, 1, 3]	1	[1, 2, 3, 36]
 * [3,2,6]	10	[-1]
 */
public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) return new int[]{-1};

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
