package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * teachermode e
 * e index를 구하고 index에서 각각의 string index를 뺀다음 절대값의 가장 작은 값을 저장한다.
 */
public class 가장짧은문자거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(solution(s, t));
    }

    private static String solution(String s, String t) {
        String result = "";
        List<Integer> targetIndexList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(t)) {
                targetIndexList.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (Integer targetIndex : targetIndexList) {
                int abs = Math.abs(targetIndex - i);
                if (min > abs) {
                    min = abs;
                }
            }
            result += min + " ";
        }
        return result.trim();
    }
}
