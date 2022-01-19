package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-03
 */

/**
 * s	result
 * "aabbaccc"	7
 * "ababcdcdababcdcd"	9
 * "abcabcdede"	8
 * "abcabcabcabcdededededede"	14
 * "xababcdcdababcdcd"	17
 */
public class 문자열압축 {
    public static int solution(String s) {
        int min = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String temp = "";
            int count = 1;

            for (int j = 0; j < Math.ceil((double) s.length() / i); j++) {
                String now = s.substring(j * i, Math.min(i * (j + 1), s.length()));
                if (!temp.equals(now)) {
                    if (count != 1) {
                        sb.append(count);
                        count = 1;
                    }
                    sb.append(temp);
                    temp = now;
                } else
                    count++;
            }
            if (count != 1)
                sb.append(count);
            sb.append(temp);

            min = Math.min(min, sb.toString().length());
        }

        return min;
    }

    public static void main(String[] args) {
        solution("aabbaccc");
    }
}
