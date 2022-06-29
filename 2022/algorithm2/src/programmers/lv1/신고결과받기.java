package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/06/29
 */
public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(report));

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> resultMap = new LinkedHashMap<>();

        for (String value : id_list) {
            map.put(value, 0);
            resultMap.put(value, 0);
        }
        for (String s : set) {
            map.put(s.split(" ")[1], map.get(s.split(" ")[1]) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() >= k) {
                list.add(stringIntegerEntry.getKey());
            }
        }
        for (String s : set) {
            if (list.contains(s.split(" ")[1])) {
                resultMap.put(s.split(" ")[0], resultMap.get(s.split(" ")[0]) + 1);
            }
        }
        int[] answer = new int[resultMap.size()];
        int i = 0;
        for (Integer value : resultMap.values()) {
            answer[i] = value;
            i++;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        신고결과받기 신고결과받기 = new 신고결과받기();
        System.out.println(신고결과받기.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                                           new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}
            , 2));
    }
}
