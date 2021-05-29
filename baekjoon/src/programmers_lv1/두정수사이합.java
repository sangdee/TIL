package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */
public class 두정수사이합 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }else {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }


        return answer;
    }
}
