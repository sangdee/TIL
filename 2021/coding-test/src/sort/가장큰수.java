package sort;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @when : 2021-05-14
 * @github : http://github.com/sangdee
 */
public class 가장큰수 {
    public static String solution(int[] numbers) {
        String answer = "";
        answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> -s1.concat(s2).compareTo(s2.concat(s1)))
                .reduce("", (s1, s2) -> s1.equals("0") && s2.equals("0") ? "0" : s1.concat(s2));
        return answer;
    }

}
