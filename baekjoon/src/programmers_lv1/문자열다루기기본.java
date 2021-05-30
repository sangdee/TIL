package programmers_lv1;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 문자열다루기기본 {
    public static boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if (length != 4 && length != 6) {
            answer = false;
        } else {
            for (int i = 0; i < length; i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));
    }
}
