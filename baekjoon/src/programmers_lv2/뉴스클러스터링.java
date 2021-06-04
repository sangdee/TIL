package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-04
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * str1	        str2	        answer
 * FRANCE	    french	        16384
 * handshake	shake hands	    65536
 * aa1+aa2	    AAAA12	        43690
 * E=M*C^2	    e=m*c^2	        65536
 */
public class 뉴스클러스터링 {
    public static int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            if (Character.isLetter(str1.charAt(i)) && Character.isLetter(str1.charAt(i + 1))) {
                list1.add(str1.charAt(i) + String.valueOf(str1.charAt(i + 1)));
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            if (Character.isLetter(str2.charAt(i)) && Character.isLetter(str2.charAt(i + 1))) {
                list2.add(str2.charAt(i) + String.valueOf(str2.charAt(i + 1)));
            }
        }
        if (list1.isEmpty() && list2.isEmpty()) {
            return 65536;
        }
        Collections.sort(list1);
        Collections.sort(list2);

        List<String> intersection = new ArrayList<>();

        System.out.println(list1);
        System.out.println(list2);

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    intersection.add(list2.get(j));
                    list1.remove(i);
                    list2.remove(j);
                    i = -1;
                    break;
                }
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(intersection);

        double result = intersection.size() / (double) (list1.size() + list2.size() + intersection.size());
        answer = (int) (result * 65536);

        System.out.println(result);
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("E=M*C^2", "e=m*c^2"));

    }
}
