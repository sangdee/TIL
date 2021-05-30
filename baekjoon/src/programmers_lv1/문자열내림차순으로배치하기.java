package programmers_lv1;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @when : 2021-05-30
 * @github : http://github.com/sangdee
 */
public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
