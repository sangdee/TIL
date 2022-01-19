package programmers_lv1;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/12/21
 */
public class 없는숫자더하기 {

    public int solution(int[] numbers) {
        int answer = 45;
        int sum = Arrays.stream(numbers).sum();
        return answer - sum;
    }


}
