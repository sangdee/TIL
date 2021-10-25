package greedy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-04
 */
public class 조이스틱 {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();

        //최대로 가질 수 있는 min 값은 끝까지 가는 것
        int min_move = len - 1;

        for (int i = 0; i < len; i++) {
            if (name.charAt(i) <= 'M') {
                answer += name.charAt(i) - 'A';
            } else {
                answer += 'Z' - name.charAt(i) + 1;
            }
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                ++next;
            }
            min_move = Math.min(min_move, i + len - next + Math.min(i, len - next));
        }
        answer += min_move;
        return answer;
    }
}
