package programmers_lv1;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        String value = new StringBuilder(new String(chars)).reverse().toString();

        return Long.parseLong(value);
    }
}
