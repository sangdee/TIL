package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-31
 */

/**
 * s	return
 * "try hello world"	"TrY HeLlO WoRlD"
 */
public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split("");
        int count = 0;

        for (int i = 0; i < s1.length; i++) {
            if ((s1[i].equals(" "))) {
                count = 0;
            } else {
                if (count % 2 == 0) {
                    s1[i] = s1[i].toUpperCase();
                    count++;
                } else {
                    s1[i] = s1[i].toLowerCase();
                    count++;
                }
            }
            answer += s1[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 이상한문자만들기().solution("try hello world"));
        System.out.println(new 이상한문자만들기().solution("hello world        "));
        System.out.println(new 이상한문자만들기().solution("hello    world        "));
    }
}
