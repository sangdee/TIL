package nv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/30
 */

public class Solution1 {

    public static int solution(String[] id_list, int k) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        for (String s : id_list) {
            String[] split = s.split(" "); // a,b,c,d
            Set<String> set1 = new HashSet<>(Arrays.asList(split));

            list.addAll(set1);
        }

        Set<String> set2 = new HashSet<>(list);
        for (String s : set2) {
            List<String> collect = list.stream().filter(i -> i.equals(s))
                .collect(Collectors.toList());
            int size = collect.size();
            if (size >= k) {
                answer += k;
            } else {
                answer += size;
            }
        }
        if (k == 0) {
            return 0;
        }

        return answer;
    }

   
}
