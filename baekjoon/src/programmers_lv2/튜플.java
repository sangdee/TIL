package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-02
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * s	result
 * "{{2},{2,1},{2,1,3},{2,1,3,4}}"	[2, 1, 3, 4]
 * "{{1,2,3},{2,1},{1,2,4,3},{2}}"	[2, 1, 3, 4]
 * "{{20,111},{111}}"	[111, 20]
 * "{{123}}"	[123]
 * "{{4,2,3},{3},{2,3,4,1},{2,3}}"	[3, 2, 4, 1]
 */
public class 튜플 {
    public static int[] solution(String s) {

        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] split = s.split("-");

        Arrays.sort(split, Comparator.comparingInt(String::length));

        List<Integer> list = new ArrayList<>();
        for (String string : split) {
            String[] strings = string.split(",");
            for (String val : strings) {
                System.out.println(val);
                if (!list.contains(Integer.valueOf(val))) {
                    list.add(Integer.valueOf(val));
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"));
    }

}
