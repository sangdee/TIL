package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-07
 */

/**
 * name	return
 * "JEROEN"	56
 * "JAN"	23
 */
public class 조이스틱 {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        int move = length - 1;

        //JAN
        for (int i = 0; i < length; i++) {
            if (name.charAt(i) <= 'M') {
                answer += name.charAt(i) - 'A';
            } else {
                answer += 'Z' - name.charAt(i) + 1;
            }

            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            move = Math.min(move, i + length - next + Math.min(i, length - next));
        }
        answer += move;
        return answer;
    }

    public static void main(String[] args) {

    }
}
