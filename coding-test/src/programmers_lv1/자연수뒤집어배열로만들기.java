package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */
public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = s.charAt(i) - '0';

        }
        return answer;
    }
}
