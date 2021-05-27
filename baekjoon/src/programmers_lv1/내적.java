package programmers_lv1;

/**
 * @author : Sangji Lee
 * @when : 2021-05-27
 * @github : http://github.com/sangdee
 */
public class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}
