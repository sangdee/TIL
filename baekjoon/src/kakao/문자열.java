package kakao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Sangji Lee
 * @when : 2021-05-08
 * @github : http://github.com/sangdee
 */
public class 문자열 {
    public static int solution(String s) {
        int answer = 0;
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("zero", 0);
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);
        map1.put("four", 4);
        map1.put("five", 5);
        map1.put("six", 6);
        map1.put("seven", 7);
        map1.put("eight", 8);
        map1.put("nine", 9);
        map1.put("0", 0);
        map1.put("1", 1);
        map1.put("2", 2);
        map1.put("3", 3);
        map1.put("4", 4);
        map1.put("5", 5);
        map1.put("6", 6);
        map1.put("7", 7);
        map1.put("8", 8);
        map1.put("9", 9);
        String value = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            value += s.charAt(i);
            if (map1.containsKey(value)) {
                result += map1.get(value);
                value = "";
            }
        }
        answer = Integer.parseInt(result);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}
