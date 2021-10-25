package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */
public class 가운데글가져오기 {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;
        if (s.length() % 2 == 0) {
            answer = s.substring(mid - 1, mid + 1);
        } else {
            answer = s.substring(mid, mid + 1);
        }

        return answer;
    }
}
