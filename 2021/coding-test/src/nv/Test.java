package nv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/12
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.solution(new int[]{7,4,-2,4,-2,-9}));
    }

    public int solution(int[] A) {
        int result;
        if (A.length <= 2) {
            return A.length;
        } else {
            result = 2;
            int temp = 2;
            for (int i = 2; i < A.length; i++) {
                if (A[i] == A[i - 2]) {
                    temp = temp + 1;
                } else {
                    temp = 2;
                }
                result = Math.max(temp, result);
            }

        }
        return result;
    }
}


class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(
            "Sang ji",
            "abc"));
    }

    public String solution(String S, String C) {
        String[] split = S.split(", ");
        List<String> list = new ArrayList<>(Arrays.asList(split));

        String companyName = "@" + C.toLowerCase() + ".com>";

        List<String> checkDuplicationList = new ArrayList<>(),
                     resultList = new ArrayList<>();

        for (String s : list) {
            String startEmail = "<";

            String[] strings = s.split(" ");
            if (strings.length == 2) {
                startEmail += String.valueOf(strings[0].toLowerCase().charAt(0));
                startEmail += strings[1].toLowerCase();
            } else if (strings.length == 3) {
                startEmail +=
                    String.valueOf(strings[0].toLowerCase().charAt(0)) + strings[1].toLowerCase()
                        .charAt(0);
                String last = strings[2].replace("-", "").toLowerCase();
                if (last.length() > 8) {
                    startEmail += last.substring(0, 8);
                } else {
                    startEmail += last;
                }
            }
            String value = startEmail + companyName;
            int i = 2;
            while (true) {
                if (!checkDuplicationList.contains(value)) {
                    checkDuplicationList.add(value);
                    break;
                } else {
                    value = startEmail + i + companyName;
                    i++;
                }
            }
            resultList.add(s + " " + value);
        }
        return String.join(", ", resultList);
    }
}

//
//class Solution2{
//    public int solution(int[] T, int[] A) {
//        // write your code in Java SE 8
//    }
//}