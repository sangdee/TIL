package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-04
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * orders	                                            course  	result
 * ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]	    [2,3,4] 	["AC", "ACDE", "BCFG", "CDE"]
 * ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"]	[2,3,5] 	["ACD", "AD", "ADE", "CD", "XYZ"]
 * ["XYZ", "XWY", "WXA"]	                            [2,3,4]	    ["WX", "XY"]
 */
public class 메뉴리뉴얼 {
    public static String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();

        for (int size : course) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < orders.length; i++) {
                for (int j = 0; j < orders[i].length(); j++) {
                    for (int k = j + 1; k < orders[i].length(); k++) {
                        if (k + (size - 1) <= orders[i].length()) {
                            String s = orders[i].substring(j, j + 1) + orders[i].substring(k, k + (size - 1));
                            //"AB", "ABC", "ABCD", "ABD", "AC", "ACD", "AD", "BC", "BCD", "BD", "CD"
                            char[] chars = s.toCharArray();
                            Arrays.sort(chars);
                            String val = new String(chars);
                            map.put(val, map.getOrDefault(val, 0) + 1);
                        }
                    }
                }
            }
            System.out.println(map);
            int max = 0;
            for (int i : map.values()) {
                if (max < i) {
                    max = i;
                }
            }
            if (max > 1) {
                for (String s : map.keySet()) {
                    if (map.get(s).equals(max)) {
                        result.add(s);
                    }
                }
            }
        }
        Collections.sort(result);

        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        System.out.println(result);
        return answer;
    }
    //조합 (순서관심없고 뽑은 유무만 생각)
    private static void combination(int[] comArr, int n, int r, int index, int target) {
        if (r == 0) {
            for (int i : comArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (target == n) return;

        comArr[index] = target;
        combination(comArr, n, r - 1, index + 1, target + 1);//뽑는경우
        combination(comArr, n, r, index, target + 1);//안뽑는경우

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"ABCD", "ABCD", "ABCD"}, new int[]{
                2, 3, 4
        })));
    }
}
