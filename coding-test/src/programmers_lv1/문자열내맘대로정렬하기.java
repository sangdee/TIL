package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-29
 */

import java.util.Arrays;

/**
 * strings	n	return
 * ["sun", "bed", "car"]	1	["car", "bed", "sun"]
 * ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
 */
public class 문자열내맘대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            return s1.charAt(n) - s2.charAt(n) != 0
                    ? s1.charAt(n) - s2.charAt(n)
                    : s1.compareTo(s2); // 두 문자중 사전순으로 빠른거.
        });
        return strings;
    }
}
