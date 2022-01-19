package nv;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/30
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class Solution3 {

    public static String[] solution(String[] logs) {
        Set<String> person = new TreeSet<>();
        Set<String> numver = new TreeSet<>();
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> m = new HashMap<>(); // 문제 푼 수
        Map<String, Integer> t = new HashMap<>(); // 문제 번호
        Map<String, Integer> score = new HashMap<>(); // 점수

        for (String s : logs) {
            String[] split = s.split(" ");
            person.add(split[0]);
            numver.add(split[1]);

            t.put(split[0] + split[1], Integer.parseInt(split[1]));
            //t.getOrDefault(split[0], 0) + Integer.parseInt(split[1])

            map.put(split[0] + split[1],
                map.getOrDefault(split[0] + split[1], 0) > Integer.parseInt(split[2]) ?
                    map.getOrDefault(split[0] + split[1], 0)
                    : Integer.parseInt(split[2])
            );
        }

        for (String p : person) {
            for (String n : numver) {
                Integer orDefault = map.getOrDefault(p + n, map.getOrDefault(p + n, 0));
                if (orDefault != 0) {
                    m.put(p, m.getOrDefault(p, 0) + 1);
                }
                if (orDefault != 0) {
                    t.put(p, t.getOrDefault(p, 0) + Integer.parseInt(n));
                }

                if (orDefault != 0) {
                    for (int i = 0; i < map.size(); i++) {
                        score.put(p, score.getOrDefault(p, 0) + map.get(p + n));
                    }
                }

            }
        }
        Map<String, String> re = new HashMap<>();
        for (String s : person) {
            if (m.get(s) >= 5) {
                re.put(s, m.get(s).toString() + t.get(s).toString() + score.get(s).toString());
            }
        }

        Set<String> resultValue = new HashSet<>();
        Set<Entry<String, String>> entrySet = re.entrySet();
        for (Entry<String, String> entry : entrySet) {
            String value = entry.getValue();
            resultValue.add(value);
        }
        List<String> resultList = new ArrayList<>();
        for (String s : resultValue) {
            List<String> list = new ArrayList<>();
            for (Entry<String, String> entry : entrySet) {
                if (entry.getValue().equals(s)) {
                    list.add(entry.getKey());
                }
            }
            if (list.size() > 1) {
                resultList.addAll(list);
            }
        }
        if (resultList.isEmpty()) {
            return new String[]{"None"};
        } else {
            return resultList.toArray(new String[resultList.size()]);
        }
    }


}
