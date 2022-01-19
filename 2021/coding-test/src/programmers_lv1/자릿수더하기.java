package programmers_lv1;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            answer += s.charAt(i) - '0';
        }

        return answer;
    }
}
