package programmers.고득점kit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/14
 */
public class 가장큰수 {
    static public String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }
        Collections.sort(list, (n1, n2) -> (n2 + n1).compareTo(n1 + n2));

        for (String s : list) {
            answer += s;
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[] {3, 30, 34, 5, 9 ,0 });
    }
}
