package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */

import java.util.Arrays;

/**
 * d	budget	result
 * [1,3,2,5,4]	9	3
 * [2,2,3,3]	10	4
 */
public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] < 0) break;
            else {
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }
}
